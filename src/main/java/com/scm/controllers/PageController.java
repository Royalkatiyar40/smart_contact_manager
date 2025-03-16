package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class PageController{
    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("name","Ansh Katiyar");
        model.addAttribute("youtube","Akriti code");
        model.addAttribute("github_repo","https://github.com/royalkatiyar40/");
        return "home";
    }

    //about route
    @RequestMapping("/about")
    public String aboutPage(Model model){
        model.addAttribute("isLogin", true);
        return"about";
    }
    
    //services
    @RequestMapping("/services")
    public String servicesPage(){
        return"services";
    }
}