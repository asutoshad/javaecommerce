package com.example.demo.controller;

import com.example.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontendController {
    @Autowired
    private ItemService iser;

    @GetMapping("/")
    public String getHome(Model model){
        model.addAttribute("ilist", iser.allItems());
        return "frontend/home";
    }
}




