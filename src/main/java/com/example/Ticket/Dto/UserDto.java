package com.example.Ticket.Dto;

public class UserDto {
    private String name;
    private String password;
    private long projectIdFk;
    private boolean isAdmin;

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

    public long getProjectIdFk() {
        return projectIdFk;
    }

    public void setProjectIdFk(long projectIdFk) {
        this.projectIdFk = projectIdFk;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
