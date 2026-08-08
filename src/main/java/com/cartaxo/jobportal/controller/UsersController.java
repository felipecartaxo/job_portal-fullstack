package com.cartaxo.jobportal.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.cartaxo.jobportal.model.Users;
import com.cartaxo.jobportal.model.UsersType;
import com.cartaxo.jobportal.service.UsersTypeService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UsersController {

    private final UsersTypeService usersTypeService;

    public UsersController(UsersTypeService usersTypeService) {
        this.usersTypeService = usersTypeService;
    }

    @GetMapping("/register")
    public String register(Model model) {
        List<UsersType> usersType = usersTypeService.getAll();
        model.addAttribute("getAllTypes", usersType);
        model.addAttribute("user", new Users());

        return "register";
    }
    
}
