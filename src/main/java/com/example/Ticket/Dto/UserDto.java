package com.example.Ticket.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto {
    private String name;
    private String password;
    private long projectIdFk;
    private boolean isAdmin;
}
