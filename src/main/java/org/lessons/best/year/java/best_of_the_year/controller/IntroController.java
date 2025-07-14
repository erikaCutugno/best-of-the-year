package org.lessons.best.year.java.best_of_the_year.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IntroController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "Erika");
        return "index"; 
      
    }
}   