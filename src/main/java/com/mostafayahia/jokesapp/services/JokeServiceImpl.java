package com.mostafayahia.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokesService {

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public String getJoke() {

        return quotes.getRandomQuote();
    }
}
