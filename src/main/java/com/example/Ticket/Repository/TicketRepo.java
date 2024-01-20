package com.example.Ticket.Repository;

import com.example.Ticket.Entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepo extends JpaRepository<Ticket, Long> {
    Ticket findById(long id);

    Ticket findByProjectIdFk(long projectIdFk);
}
