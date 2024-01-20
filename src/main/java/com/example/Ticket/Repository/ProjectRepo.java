package com.example.Ticket.Repository;

import com.example.Ticket.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepo extends JpaRepository<Project, Long> {
    Project findById(long id);
}
