package com.eric.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eric.curso.springboot.webapp.springboot_web.models.User;
import com.eric.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {
        User user = new User("Eric", "Vallejo");
        
        UserDto userDto = new UserDto();
        userDto.setTitle("Hola Mundo SpringBoot");
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Eric", "Vallejo");
        User user2 = new User("Mari", "Cañizares");
        User user3 = new User("Gala", "Galanson");
        User user4 = new User("Skye", "Skyenson");

        List<User> users = Arrays.asList(user, user2, user3, user4);
        //!! Lo de arriba y lo de abajo es lo mismo
        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        // users.add(user4);

        return users;
    }

    // @GetMapping("/details")
    // public Map<String, Object> details() {
    //     User user = new User("Eric", "Vallejo");
    //     Map<String, Object> body = new HashMap<>();

    //     body.put("title", "Hola Mundo Spring Boot");
    //     body.put("user", user);

    //     return body;
    // }

}
