package guru.springframework.jokesapp.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import guru.springframework.jokesapp.services.RandomQuoteServiceImpl;

@Controller
public class RandomQuoteController {
    private final RandomQuoteServiceImpl randomQuoteServiceImpl;

    public RandomQuoteController(RandomQuoteServiceImpl randomQuoteServiceImpl) {
        this.randomQuoteServiceImpl = randomQuoteServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String getRandomQuote(Model model){
        model.addAttribute("joke", randomQuoteServiceImpl.getQuote());
        return "index";
    }
}
