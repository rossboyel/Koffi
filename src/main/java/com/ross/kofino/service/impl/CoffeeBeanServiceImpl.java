package com.ross.kofino.service.impl;

import com.ross.kofino.entitiy.CoffeeBean;
import com.ross.kofino.repository.CoffeeBeanRepository;
import com.ross.kofino.service.CoffeeBeanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoffeeBeanServiceImpl implements CoffeeBeanService {



    private CoffeeBeanRepository coffeeBeanRepository;

    public CoffeeBeanServiceImpl(CoffeeBeanRepository coffeeBeanRepository) {
        this.coffeeBeanRepository = coffeeBeanRepository;
    }

    @Override
    public List<CoffeeBean> getAllCoffeeBeans() {
        return coffeeBeanRepository.findAll();
    }
}
