package com.example.FrebieSir.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping ("/")
    public String home(Model model) {
        model.addAttribute("title", "HomePage");
        return "home";
    }

    @GetMapping ("/contacts")
    public String about(Model model) {
        model.addAttribute("title", "ContactPage");
        return "about";
    }



}
