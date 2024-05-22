package com.cineverse.erpc.contract.controller;

import com.cineverse.erpc.contract.aggregate.Contract;
import com.cineverse.erpc.contract.aggregate.ContractProduct;
import com.cineverse.erpc.contract.dto.ContractDTO;
import com.cineverse.erpc.contract.service.ContractService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.nio.charset.StandardCharsets;
import java.util.List;

@RestController
@RequestMapping("/contract")
public class ContractController {

    private final ContractService contractService;

    @Autowired
    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    /* 계약서 작성 */
    @PostMapping("/regist")
    public ResponseEntity<ContractDTO> registContract(@RequestPart("contract") String contractJson,
                                                      @RequestPart(value = "files", required = false) MultipartFile[] files)
            throws JsonProcessingException {

        String utf8Json = new String(contractJson.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        ObjectMapper objectMapper = new ObjectMapper();

        ContractDTO newContract = objectMapper.readValue(utf8Json, ContractDTO.class);

        contractService.registContract(newContract, files);

        return ResponseEntity.status(HttpStatus.CREATED).body(newContract);
    }

    /* 계약서 수정 */
    @PatchMapping("/modify/{contractId}")
    public ResponseEntity<Contract> modifyContract(@RequestBody ContractDTO contract, @PathVariable Long contractId) {
        return ResponseEntity.ok(contractService.modifyContract(contractId, contract));
    }

    /* 계약서 삭제 요청 */

    /* 계약서 전체 조회 */
    @GetMapping("")
    public List<Contract> findContractList() {
        List<Contract> contractList = contractService.findContractList();

        return contractList;
    }

    /* 계약서 단일 조회  */
    @GetMapping("/{contractId}")
    public ContractDTO findContractById(@PathVariable Long contractId) {
        ContractDTO contract = contractService.findContractById(contractId);

        return contract;
    }

    /* 계약서 상품 전체 조회 */
    @GetMapping("/products")
    public List<ContractProduct> findContractProductList() {
        List<ContractProduct> productList = contractService.findContractProductList();

        return productList;
    }
}
