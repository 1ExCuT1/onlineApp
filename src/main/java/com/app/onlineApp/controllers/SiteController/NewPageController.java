package com.app.onlineApp.controllers.SiteController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewPageController {
@GetMapping("/projectsPage")
    public String projectsPage(){
    return "projectsPage";
}
    @GetMapping("/")
    public String startingPage(){
        return "startingPage";
    }
    @GetMapping("/aboutMePage")
    public String aboutMePage(){
        return "aboutMePage";
    }
    @GetMapping("/learningPage")
    public String learningPage(){
    return "learningPage";
    }
    @GetMapping("/contactPage")
    public String contactPage(){
        return "contactPage";
    }

}
