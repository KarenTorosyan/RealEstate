package com.realestate.demo.controller;

import com.realestate.demo.model.BlogComment;
import com.realestate.demo.repository.BlogCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogController {

    @Autowired
    private BlogCommentRepository commentRepository;

    @GetMapping("/blog")
    public String blog() {
        return "redirect:/show";
    }

    @GetMapping("/show")
    public String show() {
        return "blog";
    }

    @GetMapping("/blogDetail")
    public String blogDetail(){
        return "redirect:/showBlogDetail";
    }

    @GetMapping("/showBlogDetail")
    public String showBlogDetail(){
        return "blog-detail";
    }

    @PostMapping("/blog/addComment")
    public String addComment(@ModelAttribute BlogComment blogComment){
        commentRepository.save(blogComment);
        return "redirect:/showBlogDetail";
    }




}
