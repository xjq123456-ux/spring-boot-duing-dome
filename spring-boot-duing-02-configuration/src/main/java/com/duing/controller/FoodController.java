package com.duing.controller;

import com.duing.bean.Food;
import com.duing.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FoodController {

//    @Value("${food.rice}")
//    private String rice;
//    @Value("${food.meat}")
//    private String meat;

    @Autowired
    private ConfigBean configBean;

    @RequestMapping("/json")
    public Food json(){
        Food food = new Food();
        food.setMeat(configBean.getMeat());
        food.setRice(configBean.getRice());
        return food;
    }
}
