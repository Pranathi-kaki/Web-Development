package com.project.SpringBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/home")
    @ResponseBody
    public String home(){
        return "Welcome to Home page";
    }

    @RequestMapping("/about")
    @ResponseBody
    public String about(){
        return "Welcome to About page";
    }
}
