package Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import services.RandomQuoteService;

@Controller
public class RandomQuoteController {
    private final RandomQuoteService randomQuoteService;

    public RandomQuoteController(RandomQuoteService randomQuoteService) {
        this.randomQuoteService = randomQuoteService;
    }

    @RequestMapping("/")
    public String getRandomQuote(Model model){
        model.addAttribute("joke", randomQuoteService.generateRandomQuote());
        return "index";
    }
}
