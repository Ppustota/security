package zura.pustota.valuteparser.service;

import zura.pustota.valuteparser.model.Currency;

public interface Converter {
    double getValueByCurrency(String currency);
}
