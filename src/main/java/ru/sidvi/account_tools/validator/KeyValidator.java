package ru.sidvi.account_tools.validator;

import ru.sidvi.account_tools.model.Account;
import ru.sidvi.account_tools.model.Bic;
import ru.sidvi.account_tools.generator.KeyGenerator;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class KeyValidator implements AccountValidator {

    private KeyGenerator generator = new KeyGenerator();
    private Bic bic;

    public KeyValidator(Bic bic) {
        this.bic = bic;
    }

    public boolean validate(Account account) {
        String actual = account.getKey();
        String generated = generator.generate(bic, account);
        return actual.equals(generated);
    }
}
