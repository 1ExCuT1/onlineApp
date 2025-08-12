package com.app.onlineApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewPageController {
@GetMapping("/")
    public String portfolio(){
    return "portfolio";
}
}
