package com.example.minverden.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
    @GetMapping("/")
    public String index()
    {
        return"home/index";
    }

    @GetMapping("about")
    public String about()
    {
        return "home/about";
    }

    @GetMapping("family")
    public String family()
    {
        return "home/family";
    }

    @GetMapping("hobbies")
    public String hobbies()
    {
        return "home/hobbies";
    }

    @GetMapping ("pets")
    public String pets()
    {
        return "home/pets";
    }
}
