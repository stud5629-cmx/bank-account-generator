package ru.sidvi.account_tools.validator;

import ru.sidvi.account_tools.model.Account;
import ru.sidvi.account_tools.refs.Currency;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class CurrencyValidator implements AccountValidator {

    public boolean validate(Account account) {
        String current = account.getCurrencyCode();
        for (Currency c : Currency.values()) {
            if (c.toString().equals(current)) {
                return true;
            }
        }
        return false;
    }
}
