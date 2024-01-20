package com.example.Ticket.Service.impl;

import com.example.Ticket.Dto.UserDto;
import com.example.Ticket.Entity.User;
import com.example.Ticket.Repository.UserRepo;
import com.example.Ticket.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;
    @Override
    public UserDto getUserDetails(long id){
        User project = userRepo.findById(id);
        return modelMapper.map(project, UserDto.class);
    }

    @Override
    public User createUser(User user){
        return userRepo.save(user);
    }

    @Override
    public void deleteUser(long id) {
        userRepo.deleteById(id);
    }
}
