package com.cineverse.erpc.employee.dto;

import lombok.Data;

@Data
public class ResponseRegistDTO {
    private int employCode;
    private String employPassword;
    private String employEmail;
    private String employHp;
    private String employNumber;
    private String employDate;
    private String resignationDate;
    private int employRankId;
    private int teamCodeId;
}