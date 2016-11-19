package ru.sidvi.account_tools.cmd.converter;

import com.beust.jcommander.IStringConverter;
import ru.sidvi.account_tools.refs.AccountType;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class AccountTypeConverter implements IStringConverter<AccountType> {

    public AccountType convert(String value) {
        return AccountType.fromString(value);
    }
}
