package ua.goit.LessonByMelnichuk.JsoupExample.currency;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.jsoup.Jsoup;
import ua.goit.LessonByMelnichuk.JsoupExample.currency.dto.CurrencyItem;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Scanner;

public class CurrencyParser {
    public static void main(String[] args) {
        String url = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
        try {

            Scanner scan = new Scanner(System.in);

            while(true){
                System.out.println("Enter currency (USD, BTC, EUR): ");
                String input = scan.nextLine();
                if (input.equals("exit")){
                    System.out.println("Bye!");
                    System.exit(0);
                }

                // Get JSON
                String response = Jsoup
                        .connect(url)
                        .ignoreContentType(true)
                        .get()
                        .body()
                        .text();

                // Create type token for Gson
                Type typeToken = TypeToken
                        .getParameterized(List.class, CurrencyItem.class)
                        .getType();

                // Convert JSON to JAVA Object
                List<CurrencyItem> currencyItems = new Gson()
                        .fromJson(response, typeToken);

                System.out.println("RAW response: " + response);

                for (CurrencyItem currencyItem: currencyItems) {
                    System.out.println(currencyItem);
                }

                Float uahUsd = currencyItems.stream()
                        .filter(it -> it.getCcy() == CurrencyItem.CCY.valueOf(input))
                        .filter(it -> it.getBase_ccy() == CurrencyItem.CCY.UAH)
                        .map(it -> it.getBuy())
                        .findFirst()
                        .orElseThrow();

                System.out.println("UAH/"+input+" buy course: " + uahUsd);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
