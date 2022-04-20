package ru.streetcover.strcov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indicators {
    @GetMapping("/indicators")
    public String indicators(Model model){
        model.addAttribute("title", "indicators");
        return "home";
    }
}
