package ee.bcs.valiit.sample;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.TrustStrategy;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;

@Component
public class ScheduledTasks {

    @Scheduled(fixedDelay = 5000)
    public void test() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException, IOException {
        System.out.println("test");

//        RestTemplate restTemplate = new RestTemplate();
//        ResponseEntity<List> responseEntity = restTemplate.getForEntity("https://api.binance.com/api/v3/klines?symbol=BTCUSDT&interval=1h&startTime=1638813600000", List.class);
//        List elements = responseEntity.getBody();
//        for (Object element : elements) {
//            List subList = (List) element;
//            System.out.println(subList.get(0) + ": " + subList.get(4));
//        }
        RestTemplate restTemplate = this.getRestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity("https://www.prismamarket.ee/products/16972", String.class);
        String body = responseEntity.getBody();
//        System.out.println(body);
        Document doc = Jsoup.parse(body);
        Elements elements = doc.select(".item");
//        System.out.println(elements);
        for (Element element : elements) {
            Attributes attributes = element.attributes();
            String ean = attributes.get("data-ean");
            System.out.println("EAN: " + ean);
            Elements nameElement = element.select(".name");
            System.out.println("Name: " + nameElement.html());
            Elements priceElement = element.select(".unit-price");
            System.out.println("Price: " + priceElement.html());
        }
    }

    public RestTemplate getRestTemplate() throws NoSuchAlgorithmException, KeyStoreException, KeyManagementException {
        TrustStrategy acceptingTrustStrategy = (X509Certificate[] chain, String authType) -> true;
        SSLContext sslContext = org.apache.http.ssl.SSLContexts.custom()
                .loadTrustMaterial(null, acceptingTrustStrategy)
                .build();
        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext);
        CloseableHttpClient httpClient = HttpClients.custom()
                .setSSLSocketFactory(csf)
                .build();
        HttpComponentsClientHttpRequestFactory requestFactory =
                new HttpComponentsClientHttpRequestFactory();
        requestFactory.setHttpClient(httpClient);
        RestTemplate restTemplate = new RestTemplate(requestFactory);
        return restTemplate;
    }

}
