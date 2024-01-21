package com.example.Ticket.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name="tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "project_id_fk",nullable = false)
    private long projectIdFk;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private long owner;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String comments;

    @Column(name = "created_by",nullable = false)
    private long createdBy;

    @Column(name="created_on",nullable = true)
    private Timestamp createdOn;
}