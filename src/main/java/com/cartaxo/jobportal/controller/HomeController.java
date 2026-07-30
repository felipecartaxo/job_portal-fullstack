package com.cartaxo.jobportal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // direciona para a página inicial
    @GetMapping("/")
    public String home() {
        return "index";
    }
}
