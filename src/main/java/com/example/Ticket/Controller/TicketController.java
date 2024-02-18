package com.example.Ticket.Controller;

import com.example.Ticket.Dto.TicketDto;
import com.example.Ticket.Service.TicketService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Ticket.Entity.Ticket;

@RestController
@RequestMapping("/api/ticket")
public class TicketController
{

    @Autowired
    private TicketService ticketService;

    @PostMapping("/create")
    public ResponseEntity<Ticket> createTicket(@RequestBody Ticket ticket){
        Ticket ticketCreated = ticketService.createTicket(ticket);
        return new ResponseEntity<Ticket>(ticketCreated, HttpStatus.CREATED);
    }

    @PostMapping("/update/{id}")
    public ResponseEntity<Ticket> updateTicket(@RequestBody TicketDto ticketDto,@PathVariable("id") Long id){
        Ticket ticketUpdated = ticketService.updateTicket(id,ticketDto);
        return new ResponseEntity<Ticket>(ticketUpdated, HttpStatus.CREATED);
    }

    @PostMapping("/delete/{id}")
    public void deleteTicket(@PathVariable("id") long ticketId){
        ticketService.deleteTicket(ticketId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<TicketDto> getTicketDetails(@PathVariable("id") long ticketId){
        TicketDto ticketDto = ticketService.getTicketDetails(ticketId);
        return new ResponseEntity<TicketDto>(ticketDto, HttpStatus.OK);
    }

    @GetMapping("/getDetails/{projectId}")
    public ResponseEntity<TicketDto> getTicketDetailsByProjectId(@PathVariable("projectId") long projectId){
        TicketDto TicketDto = ticketService.getTicketDetailsByProjectId(projectId);
        return new ResponseEntity<TicketDto>(TicketDto, HttpStatus.OK);
    }
}
