package ee.bcs.valiit.tasks.solution.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ee.bcs.valiit.tasks.solution.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class SolutionBankControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void createAccount() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Employee employee = new Employee();
        employee.setName("midagi");
        employee.setId(123);
        http://localhost:8080/solution/bank/createAccount?accountNr=EE123
        mockMvc.perform(MockMvcRequestBuilders.get("/solution/bank/createAccount?accountNr=EE123")
                .contentType("application/json")
                .content(mapper.writeValueAsString(employee))
        ).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
