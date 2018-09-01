package com.realestate.demo.controller;

import com.realestate.demo.model.Contact;
import com.realestate.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/user/help")
    public String help(){
        return "redirect:/help";
    }

    @GetMapping("/help")
    public String hlp(){
        return "contact";
    }

    @PostMapping("/user/contact")
    public String addMessage(@ModelAttribute Contact contact){
        contactRepository.save(contact);
        return "redirect:/help";
    }

}
