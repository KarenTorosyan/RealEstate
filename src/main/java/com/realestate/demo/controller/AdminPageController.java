package com.realestate.demo.controller;

import com.realestate.demo.model.Category;
import com.realestate.demo.model.ListingCity;
import com.realestate.demo.model.ListingState;
import com.realestate.demo.repository.CategoryRepository;
import com.realestate.demo.repository.ListingCityRepository;
import com.realestate.demo.repository.ListingStateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AdminPageController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ListingCityRepository cityRepository;

    @Autowired
    private ListingStateRepository stateRepository;

    @GetMapping("/admin")
    public String  admin(){
        return "redirect:admin-home";
    }

    @GetMapping("/admin-home")
    public String show(ModelMap modelMap){
        List<Category> categories = categoryRepository.findAll();
        modelMap.addAttribute("categories",categories);
        return "admin-page";
    }

    @PostMapping("/addCategory")
    public String addCategory(@ModelAttribute Category category){
        categoryRepository.save(category);
        return "redirect:admin-home";
    }

    @PostMapping("/addCity")
    public String addCity(@ModelAttribute ListingCity city){
        cityRepository.save(city);
        return "redirect:/admin-home";
    }

    @PostMapping("/addState")
    public String addState(@ModelAttribute ListingState state){
        stateRepository.save(state);
        return "redirect:/admin-home";
    }


}
