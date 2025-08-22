package com.app.onlineApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewPageController {
@GetMapping("/portfolio")
    public String portfolio(){
    return "portfolio";
}
    @GetMapping("/")
    public String startingPage(){
        return "startingPage";
    }
    @GetMapping("/homePage")
    public String homePage(){
        return "homePage";
    }

}
