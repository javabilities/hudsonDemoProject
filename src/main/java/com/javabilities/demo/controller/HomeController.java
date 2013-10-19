package com.javabilities.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @RequestMapping("hudsonDemoProject")
    public String loadHomePage(Model m) {
        m.addAttribute("name", "Javabilities");
        return "home";
    }
}
