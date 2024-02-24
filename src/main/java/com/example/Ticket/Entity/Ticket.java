package com.example.Ticket.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProjectIdFk() {
        return projectIdFk;
    }

    public void setProjectIdFk(long projectIdFk) {
        this.projectIdFk = projectIdFk;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getOwner() {
        return owner;
    }

    public void setOwner(long owner) {
        this.owner = owner;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(long createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
        this.createdOn = createdOn;
    }
}