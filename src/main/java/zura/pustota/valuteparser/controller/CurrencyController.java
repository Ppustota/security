package zura.pustota.valuteparser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import zura.pustota.valuteparser.parser.Parser;
import zura.pustota.valuteparser.service.Converter;


@RestController
@RequestMapping("/api")
public class CurrencyController {
    @Autowired
    private Converter converter;

    @GetMapping(value = "/values/{currency}")
    public double getValue(@PathVariable String currency){
        return converter.getValueByCurrency(currency);
    }

    @GetMapping("/value")
    public double get(@RequestParam String currency){
        return converter.getValueByCurrency(currency);
    }
}
