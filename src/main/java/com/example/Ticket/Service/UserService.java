package com.example.Ticket.Service;

import com.example.Ticket.Dto.UserDto;
import com.example.Ticket.Entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public UserDto getUserDetails(long id);

    public User createUser(User user);
    public void deleteUser(long id);
}
