package com.example.Ticket.Controller;

import com.example.Ticket.Dto.ProjectDto;
import com.example.Ticket.Service.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Ticket.Entity.Project;

import java.util.List;

@RestController
@RequestMapping("/api/project")
public class ProjectController
{

    @Autowired
    private ProjectService projectService;

    @PostMapping("/create")
    public ResponseEntity<Project> createProject(@RequestBody Project project){
        Project projectCreated = projectService.createProject(project);
        return new ResponseEntity<Project>(projectCreated, HttpStatus.CREATED);
    }

    @PostMapping("/delete/{id}")
    public void deleteProject(@PathVariable("id") long projectId){
        projectService.deleteProject(projectId);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ProjectDto> getProjectDetails(@PathVariable("id") long projectId){
        ProjectDto projectDto = projectService.getProjectDetails(projectId);
        return new ResponseEntity<ProjectDto>(projectDto, HttpStatus.OK);
    }

    @GetMapping("/getDetails/{userId}")
    public ResponseEntity<List<ProjectDto>> getProjectDetailsByUser(@PathVariable("userId") long userId){
        List<ProjectDto> projectDtoList = projectService.getProjectDetailsByUser(userId);
        return new ResponseEntity<List<ProjectDto>>(projectDtoList, HttpStatus.OK);
    }
}
