package com.javabilities.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/home")
public class HomeController {
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * loadHomePage
     *
     * @param m
     * @return
     */
//    @RequestMapping("home")
    public String loadHomePage(Model m) {
        logger.info("HomeController.loadHomePage()");
        m.addAttribute("name", "Javabilities");
        return "home";
    }
}
