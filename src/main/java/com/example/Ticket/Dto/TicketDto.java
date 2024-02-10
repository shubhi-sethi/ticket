package com.example.Ticket.Dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
@Getter
@Setter
public class TicketDto {

    private long projectIdFk;
    private String description;
    private long owner;
    private String status;
    private String comments;
    private long createdBy;
    private Timestamp createdOn;
}
