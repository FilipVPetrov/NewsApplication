package News.controllers;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonReader;

import News.models.Article;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

/**
 * Created by filip on 26.2.2017 г..
 */

public class NewsModel {

    public static List<Article> getAllArticles(String url) {
        List<Article> allArticles = new ArrayList<Article>();
        Client client = Client.create();

        WebResource webResource = client.resource(url);

        ClientResponse response = webResource.accept("application/json").get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
        }

        InputStream is = response.getEntityInputStream();
        JsonReader rdr = Json.createReader(is);

        JsonObject obj = rdr.readObject();
        JsonArray results = obj.getJsonArray("articles");
        for (JsonObject result : results.getValuesAs(JsonObject.class)) {
            Article newArticle = new Article();
            String author = result.getString("title");
            newArticle.setAuthor(author);
            newArticle.setTitle(result.getString("title"));
            newArticle.setDescription(result.getString("description"));
            newArticle.setUrl(result.getString("url"));
            newArticle.setUrlToImage(result.getString("urlToImage"));
            newArticle.setPublishedAt(result.getString("publishedAt"));
            allArticles.add(newArticle);
        }
        return allArticles;
    }

}
