package com.example.Ticket.Dto;

import java.sql.Timestamp;

public class TicketDto {

    private long projectIdFk;
    private String description;
    private long owner;
    private String status;
    private String comments;
    private long createdBy;
    private Timestamp createdOn;
}
