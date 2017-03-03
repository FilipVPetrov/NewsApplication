package News.controllers;

import News.models.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by filip on 27.2.2017 г..
 */

@Controller
public class BloombergController {

    @RequestMapping("/bloomberg")
    public String index(Model model){
        List<Article> allArticle = NewsController.getAllArticles("bloomberg");
        model.addAttribute("allarticles", allArticle);
        return "home";
    }

}
