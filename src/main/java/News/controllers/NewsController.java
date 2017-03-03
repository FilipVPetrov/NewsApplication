package News.controllers;

import News.models.Article;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static News.controllers.NewsModel.getAllArticles;

/**
 * Created by filip on 3.3.2017 г..
 */
public class NewsController {
    private static Map<String, String> map = new HashMap<String, String>();
    static {
        Map<String, String> temp = new HashMap<String, String>();
        temp.put("bild",
                "https://newsapi.org/v1/articles?source=bild&sortBy=top&apiKey=030df3ce40f34b1a8a2f410dddac8528");
        temp.put("bloomberg",
                "https://newsapi.org/v1/articles?source=bloomberg&sortBy=top&apiKey=030df3ce40f34b1a8a2f410dddac8528");
        map = Collections.unmodifiableMap(temp);
    }

    public static List<Article> getAllArticles(String source){
        assert source != null;
        if(map.containsKey(source)){
            String url = map.get(source);
            return NewsModel.getAllArticles(url);
        }
        return null;
    }

}
