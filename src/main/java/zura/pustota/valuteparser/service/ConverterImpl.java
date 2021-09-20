package zura.pustota.valuteparser.service;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import zura.pustota.valuteparser.model.Currency;
import zura.pustota.valuteparser.parser.Parser;

import java.util.concurrent.TimeUnit;

@Service
@Slf4j
public class ConverterImpl implements Converter {
    @Autowired
    private Parser parser;


    @SneakyThrows
    @Override
    @Cacheable(value = "currency")
    public double getValueByCurrency(String currency) {
        log.info("***Simulating Slow Service***");
        TimeUnit.SECONDS.sleep(3);
        return parser.parse().get(currency);
    }

}
