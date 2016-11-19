package ru.sidvi.account_tools.cmd.converter;


import com.beust.jcommander.IStringConverter;
import ru.sidvi.account_tools.refs.Currency;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class CurrencyConverter implements IStringConverter<Currency> {

    public Currency convert(String value) {
        return Currency.fromString(value);
    }
}
