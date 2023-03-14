package com.ross.kofino.controller;

import com.ross.kofino.entitiy.CoffeeBean;
import com.ross.kofino.service.CoffeeBeanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JsonController {

    public JsonController(CoffeeBeanService coffeeBeanService) {
        this.coffeeBeanService = coffeeBeanService;
    }

    private CoffeeBeanService coffeeBeanService;



    @GetMapping("/data")
    public List<CoffeeBean> getAllCoffeeBeans() {
        return coffeeBeanService.getAllCoffeeBeans();
    }

}
