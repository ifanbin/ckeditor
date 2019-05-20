package com.example.ckeditor2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ckeditorController {

    @RequestMapping("/index")
    public String index(){

        return "/index";
    }
}
