package com.cineverse.erpc.salesopp.opportunity.aggregate.vo;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="tbl_sales_opportunity_delete_request")
@Builder
public class SalesOppDelete {
    @Id
    @Column(name = "sales_opp_delete_request_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int salesOppDeleteRequestId;

    @Column(name = "request_content")
    private String requestContent;

    @Column(name = "request_status")
    private String requestStatus;

    @Column(name = "sales_opp_id")
    private int salesOppId;
}
