package com.app.onlineApp.controllers.OnlineStoreApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProjectController {
    @GetMapping("/project")
    public String project(){
        return "project";
    }
}
