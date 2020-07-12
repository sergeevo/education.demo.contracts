package education.demo.contracts.controller;

import java.util.List;

import education.demo.contracts.dto.ContractDto;
import education.demo.contracts.service.ContractsService;
import io.swagger.annotations.Api;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "/contracts", tags = {"Contracts API"})
@RestController
@RequestMapping(path = "/contracts", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class ContractsController {

    private final ContractsService contractsService;

    @GetMapping
    public ResponseEntity<List<ContractDto>> getContracts() {
        return ResponseEntity.ok(contractsService.getContracts());
    }
}
