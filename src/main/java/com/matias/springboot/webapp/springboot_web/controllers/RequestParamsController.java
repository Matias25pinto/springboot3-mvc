package com.matias.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.matias.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.matias.springboot.webapp.springboot_web.models.dto.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Hola por defecto") String message){

        ParamDto param = new ParamDto();
        //si no eviamos defaultValue
      //param.setMessage(message != null ? message : "Hola default");
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code){

        ParamMixDto param = new ParamMixDto();
        param.setMessage(text);
        param.setCode(code);
        return param;

    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request){

        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamMixDto param = new ParamMixDto();
        param.setCode(code);
        param.setMessage(request.getParameter("message"));
        return param;

    }
}
