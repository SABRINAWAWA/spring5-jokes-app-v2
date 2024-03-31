package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteServiceImpl implements QuoteService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public RandomQuoteServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
