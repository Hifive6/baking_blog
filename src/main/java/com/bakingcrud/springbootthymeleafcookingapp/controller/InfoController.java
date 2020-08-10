package com.bakingcrud.springbootthymeleafcookingapp.controller;

import com.bakingcrud.springbootthymeleafcookingapp.model.Info;
import com.bakingcrud.springbootthymeleafcookingapp.service.InfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class InfoController {

    @Autowired
    private InfoService infoService;

    

    // display list of all info
    @GetMapping("/")
    public String viewHomePage(Model model, Info info) {
        model.addAttribute("listInfo", infoService.getAllInfo());
        // model.addAttribute("listInfo", InfoRespository.findAll());
        // model.addAttribute("imgUtil", new ImageUtil());

        return "index";
    }

    
    @GetMapping(value = "/addInfoForm")
    public String addInfoForm(Model model) {
        Info info = new Info();
        model.addAttribute("info", info);
        return "new_bake";
    }

    @PostMapping("/saveInfo")
    public String saveInfo(@ModelAttribute("info") Info info) {
       
        infoService.saveInfo(info);
        return "redirect:/";
    }
    
}