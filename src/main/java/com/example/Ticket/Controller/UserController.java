package com.example.Ticket.Controller;

import com.example.Ticket.Dto.UserDto;
import com.example.Ticket.Service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.Ticket.Entity.User;

@RestController
@RequestMapping("/api/user")
public class UserController
{

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User ticketCreated = userService.createUser(user);
        return new ResponseEntity<User>(ticketCreated, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable("id") long userId){
        UserDto userDto = userService.getUserDetails(userId);
        return new ResponseEntity<UserDto>(userDto, HttpStatus.OK);
    }

    @PostMapping("/delete/{id}")
    public void deleteUser(@PathVariable("id") long userId){
        userService.deleteUser(userId);
    }
}
