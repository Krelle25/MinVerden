package com.example.minverden.controller;

import com.example.minverden.model.Presentation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PresentationController {

    @GetMapping("/page/{name}")
    public String showPage(@PathVariable String name, Model model) {
        Presentation presentation;

        switch (name) {
            case "about":
                presentation = new Presentation(
                        "Om mig",
                        "Her er en kort beskrivelse om mig.",
                        "/images/about.jpg"
                );
                break;
            case "family":
                presentation = new Presentation(
                        "Min familie",
                        "Her kan du læse om min familie.",
                        "/images/family.jpg"
                );
                break;
            case "hobbies":
                presentation = new Presentation(
                        "Mine hobbier",
                        "Her er information om mine hobbier.",
                        "/images/hobbies.jpg"
                );
                break;
            case "pets":
                presentation = new Presentation(
                        "Mine kæledyr",
                        "Her er information om mine kæledyr.",
                        "/images/pets.jpg"
                );
                break;
            default:
                presentation = new Presentation(
                        "Forsiden",
                        "Velkommen til startside!",
                        "/images/index.jpg"
                );
                name = "index";
                break;
        }
        model.addAttribute("presentation", presentation);
        return "home/" + name;
    }
}
