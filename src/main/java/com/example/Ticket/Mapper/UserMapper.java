package com.example.Ticket.Mapper;

import com.example.Ticket.Dto.UserDto;
import com.example.Ticket.Entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDto, User>{
}
