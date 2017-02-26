package News.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by filip on 26.2.2017 г..
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }


}
