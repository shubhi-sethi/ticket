package com.example.Ticket.Service;

import com.example.Ticket.Dto.ProjectDto;
import com.example.Ticket.Entity.Project;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjectService {
    public ProjectDto getProjectDetails(long id);
    public List<ProjectDto> getProjectDetailsByUser(long userId);
    public Project createProject(Project project);

    public void deleteProject(long id);
}
