package com.example.Ticket.Entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "password",nullable = false)
    private String password;

    public Set<Project> getProjectTagged() {
        return projectTagged;
    }

    public void setProjectTagged(Set<Project> projectTagged) {
        this.projectTagged = projectTagged;
    }

    @ManyToMany
    @JoinTable(
            name = "user_to_project_mapping",
            joinColumns = @JoinColumn(name = "user_id_fk"),
            inverseJoinColumns = @JoinColumn(name = "project_id_fk"))
    Set<Project> projectTagged;

    @Column(name = "is_admin",nullable = false)
    private boolean isAdmin;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}