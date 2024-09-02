package com.matias.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//En vez de utilizar @RestController puedo utilizar @Controller, pero tengo que indicar que voy a devolver un Json usando la anotacion @ResponseBody
@Controller
@RequestMapping("/api/response-body")
public class UserResponseBodyController {

    //@GetMapping("/details") la anotacion @GetMapping es un alías de @RequestMapping()
    @RequestMapping(path="/details", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> details(){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo Spring Boot Map");
        body.put("name", "Matias");
        body.put("lastname", "Pinto");
        return body;
    }
}
