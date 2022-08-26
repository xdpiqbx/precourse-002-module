package ua.goit.LessonByMelnichuk.JsoupExample;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class HabrJsoupTests {
    public static void main(String[] args) {
        String url = "https://habr.com/ru/all/";
//        Connection method = Jsoup.connect(url).method(Connection.Method.GET);
        try {
            Document document = Jsoup.connect(url).get();
            // document - has lot of selectors. getAllElements() getElement....By...()

//            Element body = document.body();
//            String text = body.text();
//            String text = body.html();
//            System.out.println(text);

            Element head = document.getElementsByTag("head").first();
            Element title = head.getElementsByTag("title").first();

            System.out.println("title = " + title); // <title>Все публикации подряд / Хабр</title>
            System.out.println("title = " + title.text()); // Все публикации подряд / Хабр

            // -------------------------------------------------------------------------------------

            Elements articles = document.selectFirst("div.tm-articles-list").select("article");
            for (Element article : articles) {
                HabrArticleParser parser = new HabrArticleParser(article);
                String artTitle = parser.getTitle();
                int raiting = parser.getRaiting();

                System.out.println(artTitle + " - " + raiting);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class HabrArticleParser {
    private Element article;

    public HabrArticleParser(Element article) {
        this.article = article;
    }

    public String getTitle(){
        return this.article.getElementsByTag("h2").first().text();
    }

    public int getRaiting(){
        String textRaiting = this.article
                .select("div.tm-votes-meter")
                .select("span.tm-votes-meter__value")
                .text();
        return Integer.parseInt(textRaiting.replace("+", ""));
    }
}