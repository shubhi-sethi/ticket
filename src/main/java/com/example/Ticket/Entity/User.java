package com.example.Ticket.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="user" , schema="ticket_management")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "password",nullable = false)
    private String password;

    @Column(name = "project_id_fk",nullable = false)
    private long projectIdFk;

    @Column(name = "is_admin",nullable = false)
    private boolean isAdmin;
}