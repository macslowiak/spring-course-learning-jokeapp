package com.springlearning.jokesapp.controllers;

import com.springlearning.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokesController {

    private final JokeService jokeService;

    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }


    @GetMapping({"/",""})
    public String getRandomJoke(Model model){

        model.addAttribute("joke", jokeService.getRandomQuote());

        return "index";
    }

}
