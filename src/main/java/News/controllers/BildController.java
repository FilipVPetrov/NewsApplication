package News.controllers;

import News.models.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by filip on 26.2.2017 г..
 */
@Controller
public class BildController {

    @RequestMapping("/bild")
    public String index(Model model){
        List<Article> allArticle = NewsController.getAllArticles("bild");
        model.addAttribute("allarticles", allArticle);
        return "home";
    }

}
