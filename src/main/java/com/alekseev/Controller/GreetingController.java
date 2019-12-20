package com.alekseev.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for the main page
 */
@Controller
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public String greeting(){
        return "greeting";
    }
}
