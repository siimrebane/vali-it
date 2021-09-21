package ee.bcs.valiit.sample;

import ee.bcs.valiit.controller.model.SampleEmployeeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Component
public class ScheduledTasks {

    @Scheduled(fixedDelay = 5000)
    public void test(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<SampleEmployeeDto[]> a = restTemplate.getForEntity("http://localhost:8080/sql-test4",
                SampleEmployeeDto[].class);
        System.out.println(Arrays.toString(a.getBody()));
        ResponseEntity<String> b = restTemplate.getForEntity("http://localhost:8080/sql-test4", String.class);
        System.out.println(b.getBody());
    }
}
