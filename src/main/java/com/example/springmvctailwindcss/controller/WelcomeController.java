package com.example.springmvctailwindcss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//npx tailwindcss -i ./src/main/resources/static/input.css -o ./src/main/resources/static/output.css --watch
@Controller
public class WelcomeController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
