package com.eric.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.eric.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Eric", "Vallejo");
        user.setEmail("eric@google.com");
        model.addAttribute("title", "Hola Mundo Spring Boot");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(Model model) {

        model.addAttribute("title", "Listado de usuarios");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        return Arrays.asList(
            new User("Eric", "Vallejo", "eric@google.com"),
            new User("Mari", "Cañizares", "mari@google.com"),
            new User("Gala", "Galanson"),
            new User("Skye", "skyenson")
        );
    }

}
