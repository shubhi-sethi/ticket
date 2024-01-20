package com.example.Ticket.Service;

import com.example.Ticket.Dto.TicketDto;
import com.example.Ticket.Entity.Ticket;
import org.springframework.stereotype.Service;

@Service
public interface TicketService {
    public TicketDto getTicketDetails(long id);
    public TicketDto getTicketDetailsByProjectId(long projectId);
    public Ticket createTicket(Ticket ticket);
    public void deleteTicket(long id);
    public Ticket updateTicket(Ticket ticket);
}
