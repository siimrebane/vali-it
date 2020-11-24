package ee.bcs.valiit.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import ee.bcs.valiit.Account;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc //need this in Spring Boot test
public class AccountEntityServiceTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void registrationWorksThroughAllLayers() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Account account = new Account();
        account.setBalance(BigDecimal.TEN);
        account.setAccountNr("EE123");
        mockMvc.perform(post("/test/exception_test2?i=2&j=4")
                .contentType("application/json").
                content(mapper.writeValueAsString(account))
                )
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.test").value("st"));
    }
}
