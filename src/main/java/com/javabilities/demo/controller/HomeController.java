package com.javabilities.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/** This is the Controller for the home page
 *
 * @author Lloyd H. Meinholz
 * @version 1.0
 */
@Controller
@RequestMapping("/home")
public class HomeController {
    /** The logger for HomeController */
    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    /**
     * This method will create a model containing a name for forward the request to the hom page.
     *
     * @param m    The model
     * @return     The String representation of the page to forward the request to
     */
//    @RequestMapping("home")
    public String loadHomePage(Model m) {
        logger.info("HomeController.loadHomePage()");
        m.addAttribute("name", "Javabilities");
        return "home";
    }
}
