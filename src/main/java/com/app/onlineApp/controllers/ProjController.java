package com.app.onlineApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjController {
    @GetMapping("/project")
    public String project(){
        return "project";
    }
}
