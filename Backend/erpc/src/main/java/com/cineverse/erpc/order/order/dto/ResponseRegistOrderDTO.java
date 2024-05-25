package com.cineverse.erpc.order.order.dto;

import com.cineverse.erpc.account.account.aggregate.Account;
import com.cineverse.erpc.contract.aggregate.ContractCategory;
import com.cineverse.erpc.employee.aggregate.Employee;
import com.cineverse.erpc.file.aggregate.OrderFile;
import com.cineverse.erpc.order.order.aggregate.OrderProduct;
import com.cineverse.erpc.order.order.aggregate.ShipmentStatus;
import com.cineverse.erpc.quotation.quotation.aggregate.Transaction;
import com.cineverse.erpc.warehouse.aggregate.Warehouse;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class ResponseRegistOrderDTO {
    private long orderRegistrationId;
    private String contactDate;
    private long orderTotalPrice;
    private String orderDueDate;
    private String orderDate;
    private String orderDeleteDate;
    private long totalBalance;
    private long downPayment;
    private long progressPayment;
    private long balance;
    private String orderNote;
    private Account account;
    private Employee employee;
    private Transaction transaction;
    private Warehouse warehouse;
    private ShipmentStatus shipmentStatus;
    private ContractCategory contractCategory;
    private List<OrderProduct> orderProduct;
    private List<OrderFile> orderFile;
}
