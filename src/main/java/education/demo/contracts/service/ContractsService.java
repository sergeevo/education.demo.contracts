package education.demo.contracts.service;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import education.demo.contracts.dto.ContractDto;
import org.springframework.stereotype.Service;

@Service
public class ContractsService {
    public List<ContractDto> getContracts() {
        return List.of(ContractDto.builder()
            .id(UUID.randomUUID().toString())
            .title("Very important contract")
            .signees(List.of("John Smith"))
            .dateCreated(Instant.now())
            .build());
    }
}
