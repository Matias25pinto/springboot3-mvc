package com.matias.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.matias.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Matias", "Pinto");
        //user.setEmail("matias25pinto@gmail.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("/details-map")
    public String detailsMap(Map<String, Object> model){
        model.put("title", "Hola Mundo Spring Boot Map");
        model.put("name", "Matias");
        model.put("lastname", "Pinto");
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){
        // List<User> users = new ArrayList<>();
        model.addAttribute("title", "Lista de usuarios");
    
        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel(){
        List<User> users = Arrays.asList(
            new User("user_1", "lastname_user1", "user1@email.com"),
            new User("user_2", "lastname_user2"), 
            new User("user_3", "lastname_user3"));
        return users;
    }
}
