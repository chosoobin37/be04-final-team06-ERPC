package com.cineverse.erpc.admin;

import com.cineverse.erpc.account.account.aggregate.AccountDeleteRequest;
import com.cineverse.erpc.account.account.repository.AccountDeleteRequestRepository;
import com.cineverse.erpc.admin.delete.dto.account.RequestAccountDeleteRequestProcess;
import com.cineverse.erpc.admin.delete.dto.account.ResponseAccountDeleteRequestList;
import com.cineverse.erpc.admin.delete.dto.account.ResponseAccountDeleteRequestProcess;
import com.cineverse.erpc.admin.delete.dto.account.ResponseFindAccoundDeleteRequest;
import com.cineverse.erpc.admin.delete.dto.order.RequestOrderDeleteRequestProcess;
import com.cineverse.erpc.admin.delete.dto.order.ResponseFindOrderDeleteRequest;
import com.cineverse.erpc.admin.delete.dto.order.ResponseOrderDeleteRequestList;
import com.cineverse.erpc.admin.delete.dto.order.ResponseOrderDeleteRequestProcess;
import com.cineverse.erpc.admin.delete.dto.quotation.RequestQuotationDeleteRequestProcess;
import com.cineverse.erpc.admin.delete.dto.quotation.ResponseFindQuotationDeleteRequest;
import com.cineverse.erpc.admin.delete.dto.quotation.ResponseQuotationDeleteRequestList;
import com.cineverse.erpc.admin.delete.dto.quotation.ResponseQuotationDeleteRequestProcess;
import com.cineverse.erpc.admin.delete.service.DeleteService;
import com.cineverse.erpc.contract.aggregate.Contract;
import com.cineverse.erpc.contract.aggregate.ContractDeleteRequest;
import com.cineverse.erpc.contract.dto.ContractDeleteRequestDTO;
import com.cineverse.erpc.contract.repository.ContractDeleteRequestRepository;
import com.cineverse.erpc.contract.repository.ContractRepository;
import com.cineverse.erpc.order.order.aggregate.OrderDeleteRequest;
import com.cineverse.erpc.order.order.repo.OrderDeleteRequestRepository;
import com.cineverse.erpc.quotation.quotation.aggregate.Quotation;
import com.cineverse.erpc.quotation.quotation.aggregate.QuotationDeleteRequest;
import com.cineverse.erpc.quotation.quotation.repo.QuotationDeleteRequestRepository;
import com.cineverse.erpc.quotation.quotation.repo.QuotationRepository;
import com.cineverse.erpc.salesopp.opportunity.aggregate.SalesOpp;
import com.cineverse.erpc.salesopp.opportunity.aggregate.SalesOppDeleteRequest;
import com.cineverse.erpc.salesopp.opportunity.dto.SalesOppDeleteRequestDTO;
import com.cineverse.erpc.salesopp.opportunity.repository.SalesOppDeleteRequestRepository;
import com.cineverse.erpc.salesopp.opportunity.repository.SalesOppRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class DeleteTests {
    private final DeleteService deleteService;
    private final SalesOppDeleteRequestRepository salesOppDeleteRequestRepository;
    private final SalesOppRepository salesOppRepository;
    private final ContractDeleteRequestRepository contractDeleteRequestRepository;
    private final ContractRepository contractRepository;
    private final QuotationDeleteRequestRepository quotationDeleteRequestRepository;
    private final QuotationRepository quotationRepository;
    private final AccountDeleteRequestRepository accountDeleteRequestRepository;
    private final OrderDeleteRequestRepository orderDeleteRequestRepository;

    @Autowired
    public DeleteTests(DeleteService deleteService,
                       SalesOppDeleteRequestRepository salesOppDeleteRequestRepository,
                       SalesOppRepository salesOppRepository,
                       ContractDeleteRequestRepository contractDeleteRequestRepository,
                       ContractRepository contractRepository,
                       QuotationDeleteRequestRepository quotationDeleteRequestRepository,
                       QuotationRepository quotationRepository,
                       AccountDeleteRequestRepository accountDeleteRequestRepository,
                       OrderDeleteRequestRepository orderDeleteRequestRepository) {
        this.deleteService = deleteService;
        this.salesOppDeleteRequestRepository = salesOppDeleteRequestRepository;
        this.salesOppRepository = salesOppRepository;
        this.contractDeleteRequestRepository = contractDeleteRequestRepository;
        this.contractRepository = contractRepository;
        this.quotationDeleteRequestRepository = quotationDeleteRequestRepository;
        this.quotationRepository = quotationRepository;
        this.accountDeleteRequestRepository = accountDeleteRequestRepository;
        this.orderDeleteRequestRepository = orderDeleteRequestRepository;
    }

    @Test
    @Transactional
    @DisplayName("영업기회 삭제요청 전체조회 테스트")
    public void findSalesOppDeleteRequestList() {
        List<SalesOppDeleteRequest> actualSalesOppDeleteRequestList = salesOppDeleteRequestRepository.findAll();
        List<SalesOppDeleteRequest> testSalesOppDeleteRequestList = deleteService.findSalesOppDeleteRequestList();

        assertThat(testSalesOppDeleteRequestList.size()).isEqualTo(actualSalesOppDeleteRequestList.size());
        assertThat(testSalesOppDeleteRequestList).isNotEmpty();
    }

    @Test
    @Transactional
    @DisplayName("영업기회 삭제요청 단일조회 테스트")
    public void findSalesOppDeleteRequest() {
        SalesOppDeleteRequest salesOppDeleteRequest =
                salesOppDeleteRequestRepository.findById(17L)
                        .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 영업기회 삭제요청입니다."));

        SalesOppDeleteRequestDTO testOppDeleteRequest =
                deleteService.findSalesOppDeleteRequestById(17);

        assertThat(salesOppDeleteRequest.getSalesOppDeleteRequestReason())
                .isEqualTo(testOppDeleteRequest.getSalesOppDeleteRequestReason());

        assertThat(salesOppDeleteRequest.getSalesOppDeleteRequestStatus())
                .isEqualTo(testOppDeleteRequest.getSalesOppDeleteRequestStatus());

        assertThat(salesOppDeleteRequest.getSalesOpp())
                .isEqualTo(testOppDeleteRequest.getSalesOpp());
    }

    @Test
    @Transactional
    @DisplayName("영업기회 삭제처리 테스트")
    public void deleteSalesOpp() {
        SalesOpp salesOpp = salesOppRepository.findById(32L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 영업기회입니다."));

        SalesOppDeleteRequest deleteOppRequest = SalesOppDeleteRequest.builder()
                .salesOppDeleteRequestId(17)
                .salesOpp(salesOpp)
                .build();

        SalesOppDeleteRequest deletedRequest =
                deleteService.oppDeleteRequestProcess(deleteOppRequest);

        assertThat(deletedRequest.getSalesOppDeleteRequestStatus()).isEqualTo('Y');
        assertThat(salesOpp.getOppDeleteDate()).isNotNull();
    }

    @Test
    @Transactional
    @DisplayName("계약서 삭제요청 전체조회 테스트")
    public void findContractDeleteRequestList() {
        List<ContractDeleteRequest> actualContractDeleteRequestList = contractDeleteRequestRepository.findAll();
        List<ContractDeleteRequest> testContractDeleteRequestList = deleteService.findContractDeleteRequestList();

        assertThat(testContractDeleteRequestList.size()).isEqualTo(actualContractDeleteRequestList.size());
        assertThat(testContractDeleteRequestList).isNotEmpty();
    }

    @Test
    @Transactional
    @DisplayName("계약서 삭제요청 단일조회 테스트")
    public void findContractDeleteRequest() {
        ContractDeleteRequest contractDeleteRequest = contractDeleteRequestRepository.findById(14L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 계약서 삭제요청입니다."));

        ContractDeleteRequestDTO testContractDeleteRequest =
                deleteService.findContractDeleteRequestById(14);

        assertThat(contractDeleteRequest.getContractDeleteRequestReason())
                .isEqualTo(testContractDeleteRequest.getContractDeleteRequestReason());

        assertThat(contractDeleteRequest.getContractDeleteRequestStatus())
                .isEqualTo(testContractDeleteRequest.getContractDeleteRequestStatus());

        assertThat(contractDeleteRequest.getContract()).isEqualTo(testContractDeleteRequest.getContract());
    }

    @Test
    @Transactional
    @DisplayName("계약서 삭제처리 테스트")
    public void deleteContract() {
        Contract contract = contractRepository.findById(60L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 계약서입니다."));

        ContractDeleteRequest contractDeleteRequest = ContractDeleteRequest.builder()
                .contractDeleteRequestId(26)
                .contract(contract)
                .build();

        ContractDeleteRequest deletedRequest
                = deleteService.contractDeleteRequestProcess(contractDeleteRequest);

        assertThat(deletedRequest.getContractDeleteRequestStatus()).isEqualTo('Y');
        assertThat(contract.getContractDeleteDate()).isNotNull();
    }

    @Test
    @Transactional
    @DisplayName("견적서 삭제요청 전체조회 성공 테스트")
    public void successFindQuotationDeleteRequestListTest() {
        List<ResponseQuotationDeleteRequestList> quotationDeleteRequestLists
                = deleteService.findQuotationDeleteRequestList();

        assertThat(quotationDeleteRequestLists).isNotEmpty();
    }

    @Test
    @Transactional
    @DisplayName("견적서 삭제요청 단일조회 성공 테스트")
    public void successFindQuotationDeleteRequestByIdTest() {
        QuotationDeleteRequest quotationDeleteRequest =
                quotationDeleteRequestRepository.findById(13L)
                        .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 삭제요청입니다."));

        ResponseFindQuotationDeleteRequest testQuotationDeleteRequest =
                deleteService.findQuotationDeleteRequestById(13L);

        assertThat(quotationDeleteRequest.getQuotationDeleteRequestReason())
                .isEqualTo(testQuotationDeleteRequest.getQuotationDeleteRequestReason());

        assertThat(quotationDeleteRequest.getQuotationDeleteRequestStatus())
                .isEqualTo(testQuotationDeleteRequest.getQuotationDeleteRequestStatus());

        assertThat(quotationDeleteRequest.getQuotation())
                .isEqualTo(testQuotationDeleteRequest.getQuotation());
    }

    @Test
    @Transactional
    @DisplayName("견적서 삭제요청 처리 성공 테스트")
    public void successQuotationDeleteRequestProcessTest() {
        Quotation quotation = quotationRepository.findById(216L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 견적서입니다."));

        RequestQuotationDeleteRequestProcess requestQuotationDeleteRequestProcess
                = RequestQuotationDeleteRequestProcess.builder()
                .quotationDeleteRequestId(20)
                .quotation(quotation)
                .build();

        ResponseQuotationDeleteRequestProcess responseQuotationDeleteRequestProcess
                = deleteService.processQuotationDeleteRequest(requestQuotationDeleteRequestProcess);

        assertThat(responseQuotationDeleteRequestProcess.getQuotationDeleteRequestStatus()).isEqualTo("Y");
        assertThat(quotation.getQuotationDeleteDate()).isNotNull();
    }

    @Test
    @Transactional
    @DisplayName("거래처 삭제요청 전체조회 성공 테스트")
    public void successFindAccountDeleteRequestListTest() {
        List<ResponseAccountDeleteRequestList> accountDeleteRequestLists =
                deleteService.findAccountDeleteList();

        assertThat(accountDeleteRequestLists).isNotEmpty();
    }

    @Test
    @Transactional
    @DisplayName("거래처 삭제요청 단일조회 성공 테스트")
    public void successFindAccountDeleteRequestByIdTest() {
        AccountDeleteRequest accountDeleteRequest = accountDeleteRequestRepository.findById(1L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 거래처 삭제요청 입니다."));

        ResponseFindAccoundDeleteRequest testAccountDeleteRequest =
                deleteService.findAccountDeleteRequestById(1L);

        assertThat(accountDeleteRequest.getAccount()).isEqualTo(testAccountDeleteRequest.getAccount());

        assertThat(accountDeleteRequest.getAccountDeleteRequestReason())
                .isEqualTo(testAccountDeleteRequest.getAccountDeleteRequestReason());

        assertThat(accountDeleteRequest.getAccountDeleteRequestStatus())
                .isEqualTo(testAccountDeleteRequest.getAccountDeleteRequestStatus());
    }

    @Test
    @Transactional
    @DisplayName("거래처 삭제요청 처리 성공 테스트")
    public void successAccountDeleteRequestProcessTest() {
        RequestAccountDeleteRequestProcess accountDeleteRequestProcess
                = RequestAccountDeleteRequestProcess.builder()
                .accountDeleteRequestId(5)
                .build();

        ResponseAccountDeleteRequestProcess testAccountDeleteRequestProcess
                = deleteService.accountDeleteRequestProcess(accountDeleteRequestProcess);

        assertThat(testAccountDeleteRequestProcess.getAccountDeleteRequestStatus()).isEqualTo("Y");
        assertThat(testAccountDeleteRequestProcess.getAccount().getAccountDeleteDate()).isNotNull();
    }

    @Test
    @Transactional
    @DisplayName("수주 삭제요청 전체조회 성공 테스트")
    public void successFindOrderDeleteRequestListTest() {
        List<ResponseOrderDeleteRequestList> responseOrderDeleteRequestLists
                = deleteService.findOrderDeleteRequestList();

        assertThat(responseOrderDeleteRequestLists).isNotEmpty();
    }

    @Test
    @Transactional
    @DisplayName("수주 삭제요청 단일조회 성공 테스트")
    public void successFindOrderDeleteRequestById() {
        OrderDeleteRequest orderDeleteRequest = orderDeleteRequestRepository.findById(11L)
                .orElseThrow(() -> new EntityNotFoundException("존재하지 않는 수주 삭제요청 입니다."));

        ResponseFindOrderDeleteRequest testOrderDeleteRequest
                = deleteService.findOrderDeleteRequestById(11);

        assertThat(orderDeleteRequest.getOrderDeleteRequestReason())
                .isEqualTo(testOrderDeleteRequest.getOrderDeleteRequestReason());

        assertThat(orderDeleteRequest.getOrderDeleteRequestStatus())
                .isEqualTo(testOrderDeleteRequest.getOrderDeleteRequestStatus());

        assertThat(orderDeleteRequest.getOrder()).isEqualTo(testOrderDeleteRequest.getOrder());
    }

    @Test
    @Transactional
    @DisplayName("수주 삭제요청 처리 성공 테스트")
    public void successOrderDeleteRequestProcessTest() {
        RequestOrderDeleteRequestProcess requestOrderDeleteRequestProcess
                = RequestOrderDeleteRequestProcess.builder()
                .orderDeleteRequestId(11)
                .build();

        ResponseOrderDeleteRequestProcess responseOrderDeleteRequestProcess
                = deleteService.processOrderDeleteRequest(requestOrderDeleteRequestProcess);

        assertThat(responseOrderDeleteRequestProcess.getOrderDeleteRequestStatus()).isEqualTo("Y");
        assertThat(responseOrderDeleteRequestProcess.getOrder().getOrderDeleteDate()).isNotNull();
    }
}
