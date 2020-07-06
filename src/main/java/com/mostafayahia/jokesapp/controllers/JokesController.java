package com.mostafayahia.jokesapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mostafayahia.jokesapp.services.JokesService;

@Controller
public class JokesController {

    JokesService jokeService;

    @Autowired
    public JokesController(JokesService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String getJoke(Model model) {

        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }

}
