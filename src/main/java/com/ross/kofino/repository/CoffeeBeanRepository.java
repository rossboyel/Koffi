package com.ross.kofino.repository;

import com.ross.kofino.entitiy.CoffeeBean;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CoffeeBeanRepository extends JpaRepository<CoffeeBean, Integer> {
}
