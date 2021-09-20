package zura.pustota.valuteparser.parser;

import lombok.SneakyThrows;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
@Service
public class HtmlParser implements Parser {
    @SneakyThrows
    @Override
    public Map<String, Double> parse() {
        Map<String, Double> currencyMap = new HashMap<>();
        Document document = Jsoup.connect("https://conditions.bog.ge/ge/services/treasury-operations/exchange-rates").get();
        Elements tr = document.getElementsByTag("tr");
        for (int i = 2; i < tr.size(); i++) {
            currencyMap.put(tr.get(i).getElementsByTag("td").get(1).text(),
                    Double.parseDouble(tr.get(i).getElementsByTag("td").get(3).text()));
        }
        return currencyMap;
    }
}
