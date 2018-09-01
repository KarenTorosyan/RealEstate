package com.realestate.demo.controller;

import com.realestate.demo.model.*;
import com.realestate.demo.repository.*;
import com.realestate.demo.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class ListingController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ListingRepository listingRepository;

    @Autowired
    private ListingCityRepository cityRepository;

    @Autowired
    private ListingStateRepository stateRepository;


    @GetMapping("/listing-page")
    public String listing(){
        return "redirect:/listing";
    }

    @GetMapping("/listingAdd")
    public String show(ModelMap modelMap, @AuthenticationPrincipal CurrentUser currentUser){
        List<Category> categories = categoryRepository.findAll();
        modelMap.addAttribute("categories",categories);
        List<ListingCity> listingCities = cityRepository.findAll();
        modelMap.addAttribute("listingCities",listingCities);
        List<ListingState> listingStates = stateRepository.findAll();
        modelMap.addAttribute("listingStates",listingStates);
        return "add-listing";
    }

    @PostMapping("/listingAdd")
    public String addListing(@ModelAttribute Listing listing, @RequestParam("photo")MultipartFile multipartFile){
        String picName = System.currentTimeMillis() + "_" + multipartFile.getOriginalFilename();
        File file = new File("C:\\Users\\Karen\\IdeaProjects\\RealEstate\\src\\main\\resources\\images\\listingImages\\" + picName);
        try {
            multipartFile.transferTo(file);

        } catch (IOException e) {
            e.printStackTrace();
        }
        listing.setPicUrl(picName);
        listingRepository.save(listing);
        return "redirect:/thankYou";
    }

    @GetMapping("/listing")
    public String getListing(ModelMap modelMap){
        List<Listing> listings = listingRepository.findAll();
        modelMap.addAttribute("listings",listings);
        return "listing";
    }

    @GetMapping("/thankYou")
    public String thank(){
        return "thank-you";
    }

    @GetMapping("/detailListing")
    public String detailListing(){
        return "redirect:/detail";
    }

    @GetMapping("/detail")
    public String detail(){
        return"detail";
    }

}
