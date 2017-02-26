package News.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by filip on 27.2.2017 г..
 */

@Controller
public class BloombergController {

    @RequestMapping("/bloomberg")
    public String index(){

        return "TopNews";
    }

}
