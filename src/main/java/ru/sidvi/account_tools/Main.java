package ru.sidvi.account_tools;

import ru.sidvi.account_tools.generator.KeyGenerator;
import ru.sidvi.account_tools.model.Account;
import ru.sidvi.account_tools.model.Bic;
import ru.sidvi.account_tools.refs.AccountType;
import ru.sidvi.account_tools.refs.Currency;
import ru.sidvi.account_tools.validator.KeyValidator;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class Main {

    public static void main(String[] args) {
        KeyGenerator generator = new KeyGenerator();

        Bic bic = new Bic("1230221121");

        Currency currency = Currency.RUB;
        AccountType type = AccountType.PERSONAL;

        Account account = Account.create(type, currency);

        System.out.println(account);

        String key = generator.generate(bic, account);

        System.out.println();
        System.out.println(key);
        account.updateKey(key);
        System.out.println(account);

        KeyValidator validator = new KeyValidator(bic);
        System.out.println(validator.validate(account));
    }
}
