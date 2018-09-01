package com.realestate.demo.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
@RequestMapping("/images")
public class GetFileController {

    @Value("${listing.pic.dir}")
    private String listingPicDir;

    @GetMapping(value = "/listingImages")
    public @ResponseBody
    byte[] listingImage(@RequestParam("PicUrl") String picUrl) throws IOException {
        InputStream in =  new FileInputStream(listingPicDir + picUrl);
        return IOUtils.toByteArray(in);
    }
}
