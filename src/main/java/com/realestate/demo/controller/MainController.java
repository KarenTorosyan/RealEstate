package com.realestate.demo.controller;

import com.realestate.demo.model.User;
import com.realestate.demo.repository.UserRepository;
import com.realestate.demo.security.CurrentUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/")
    public String main(ModelMap modelMap, @AuthenticationPrincipal CurrentUser currentUser) {
        if (currentUser != null) {
            modelMap.addAttribute("currentUser", currentUser.getUser());
        }
        return "home";
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

//    @PostMapping("/signIn")
//    public String signIn(ModelMap modelMap, @AuthenticationPrincipal CurrentUser currentUser) {
//        if (currentUser == null) {
//            modelMap.addAttribute("currentUser", currentUser.getUser());
//        }
//        return "redirect:/home";
//    }

    @GetMapping("/signIn")
    public String signIn_(ModelMap modelMap, @AuthenticationPrincipal CurrentUser currentUser) {
        if (currentUser != null) {
            modelMap.addAttribute("currentUser", currentUser.getUser());
        }
        return "redirect:/home";
    }

    @PostMapping("/register")
    public String registerPost(@ModelAttribute User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return "redirect:/home";
    }

    @GetMapping("/register")
    public String registerGet( ModelMap modelMap, @AuthenticationPrincipal CurrentUser currentUser) {
        if (currentUser != null) {
            modelMap.addAttribute("currentUser", currentUser.getUser());
        }
        return "register";
    }



}

