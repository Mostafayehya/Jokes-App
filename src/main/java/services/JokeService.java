package services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    public String getJoke() {

        return quotes.getRandomQuote();
    }
}
