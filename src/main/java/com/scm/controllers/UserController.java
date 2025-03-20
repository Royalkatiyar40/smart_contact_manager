package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    //user dashboard

    @RequestMapping(value ="/dashboard")
    public String dashboard() { 
        return "user/dashboard";
    }
    // user profile page

    @RequestMapping(value ="/profile")
    public String profile() { 
        return "user/profile";
    }

    //user add contacts page

    //user view contacts

    // user delete contacts

    // user search contact
    
}
