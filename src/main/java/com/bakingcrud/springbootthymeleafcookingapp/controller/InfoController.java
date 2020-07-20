package com.bakingcrud.springbootthymeleafcookingapp.controller;

import com.bakingcrud.springbootthymeleafcookingapp.service.InfoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {
    
    @Autowired
    private InfoService infoService;
    //display list of all info
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listInfo", infoService.getAllInfo());
        return "index";
    }
}