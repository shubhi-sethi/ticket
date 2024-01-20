package com.example.Ticket.Service;

import com.example.Ticket.Dto.ProjectDto;
import com.example.Ticket.Entity.Project;
import org.springframework.stereotype.Service;

@Service
public interface ProjectService {
    public ProjectDto getProjectDetails(long id);
    public ProjectDto getProjectDetailsByUser(long userId);
    public Project createProject(Project project);

    public void deleteProject(long id);
}
