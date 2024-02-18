package com.example.Ticket.Mapper;

import com.example.Ticket.Dto.ProjectDto;
import com.example.Ticket.Entity.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProjectMapper extends EntityMapper<ProjectDto, Project>{
}
