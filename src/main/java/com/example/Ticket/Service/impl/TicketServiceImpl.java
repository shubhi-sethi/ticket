package com.example.Ticket.Service.impl;

import com.example.Ticket.Dto.TicketDto;
import com.example.Ticket.Entity.Ticket;
import com.example.Ticket.Mapper.TicketMapper;
import com.example.Ticket.Repository.TicketRepo;
import com.example.Ticket.Service.TicketService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketMapper ticketMapper;

    @Autowired
    TicketRepo ticketRepo;

    @Autowired
    private ModelMapper modelMapper;

    public TicketServiceImpl(TicketMapper ticketMapper) {
        this.ticketMapper = ticketMapper;
    }

    @Override
    public TicketDto getTicketDetails(long id){
        Ticket ticket = ticketRepo.findById(id);
        return modelMapper.map(ticket, TicketDto.class);
    }

    @Override
    public TicketDto getTicketDetailsByProjectId(long projectId){
        Ticket ticket = ticketRepo.findByProjectIdFk(projectId);
        return modelMapper.map(ticket, TicketDto.class);
    }

    @Override
    public Ticket createTicket(Ticket ticket){
        return ticketRepo.save(ticket);
    }

    @Override
    public Ticket updateTicket(long id ,TicketDto ticketDto){
        Ticket ticketEntry= ticketRepo.findById(id);
        ticketMapper.partialUpdate(ticketEntry,ticketDto);
        return ticketRepo.save(ticketEntry);
    }

    @Override
    public void deleteTicket(long id) {
        ticketRepo.deleteById(id);
    }
}
