package com.example.Ticket.Mapper;

import com.example.Ticket.Dto.TicketDto;
import com.example.Ticket.Entity.Ticket;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TicketMapper extends EntityMapper<TicketDto, Ticket>{
}
