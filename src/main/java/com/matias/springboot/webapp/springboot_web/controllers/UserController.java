package com.matias.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.matias.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Matias", "Pinto");
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
}
