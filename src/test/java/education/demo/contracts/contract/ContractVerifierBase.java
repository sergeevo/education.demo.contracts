package education.demo.contracts.contract;

import education.demo.contracts.ContractsApplication;
import education.demo.contracts.controller.ContractsController;
import education.demo.contracts.service.ContractsService;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@SpringBootTest(classes = {ContractsApplication.class})
public abstract class ContractVerifierBase {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders
            .standaloneSetup(new ContractsController(new ContractsService()))
            .build();
        RestAssuredMockMvc
            .mockMvc(mockMvc);
    }
}
