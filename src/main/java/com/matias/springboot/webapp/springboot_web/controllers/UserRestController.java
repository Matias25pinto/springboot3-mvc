package com.matias.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matias.springboot.webapp.springboot_web.models.User;
import com.matias.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details(){
        
        User user = new User("Matias", "Pinto");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Mundo Spring Boot DTO");
        return userDto;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(){
        Map<String, Object> body = new HashMap<>();
        User user = new User("Matias", "Pinto");
        body.put("title", "Hola Mundo Spring Boot Map");
        body.put("user", user);
        return body;
    }

    @GetMapping("/list")
    public List<User> list(){

        User user1 = new User("Matias", "Pinto");
        User user2 = new User("Nelson", "Castelvi");
        User user3 = new User("Tobias", "Rodriguez");
        
        //Forma clasica
        //List<User> userList = new ArrayList<>(); 
        //userList.add(user1);
        // userList.add(user2);
        // userList.add(user3);

        //Forma usando un helpers
        List<User> userList = Arrays.asList(user1, user2, user3);

        return userList;

    }
}
