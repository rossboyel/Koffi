package com.ross.kofino.controller;

import com.ross.kofino.entitiy.CoffeeBean;
import com.ross.kofino.service.CoffeeBeanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CoffeeBeanController {

    private CoffeeBeanService coffeeBeanService;

    public CoffeeBeanController(CoffeeBeanService coffeeBeanService) {
        this.coffeeBeanService = coffeeBeanService;
    }

    @GetMapping("/coffee-beans")
    public String listCoffeeBeans(Model model) {

        model.addAttribute("bean", coffeeBeanService.getAllCoffeeBeans());
        return "coffee-beans";
    }


    @GetMapping("/kofino")
    public String showHome() {

        return "index";
    }
}
