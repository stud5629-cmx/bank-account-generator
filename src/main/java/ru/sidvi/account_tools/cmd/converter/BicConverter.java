package ru.sidvi.account_tools.cmd.converter;


import com.beust.jcommander.IStringConverter;
import ru.sidvi.account_tools.model.Bic;
import ru.sidvi.account_tools.refs.Currency;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class BicConverter implements IStringConverter<Bic> {

    public Bic convert(String value) {
        return new Bic(value);
    }
}
