package com.example.Ticket.Service.impl;

import com.example.Ticket.Dto.ProjectDto;
import com.example.Ticket.Entity.Project;
import com.example.Ticket.Entity.User;
import com.example.Ticket.Repository.ProjectRepo;
import com.example.Ticket.Repository.UserRepo;
import com.example.Ticket.Service.ProjectService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    ProjectRepo projectRepo;

    @Autowired
    UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public ProjectDto getProjectDetails(long id){
        Project project = projectRepo.findById(id);
        return modelMapper.map(project, ProjectDto.class);
    }

    @Override
    public ProjectDto getProjectDetailsByUser(long userId){
        User user = userRepo.findById(userId);
        Project project = projectRepo.findById(user.getProjectIdFk());
        return modelMapper.map(project, ProjectDto.class);
    }

    @Override
    public Project createProject(Project project){
        return projectRepo.save(project);
    }

    @Override
    public void deleteProject(long id) {
        projectRepo.deleteById(id);
    }
}
