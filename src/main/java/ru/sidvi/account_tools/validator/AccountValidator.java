package ru.sidvi.account_tools.validator;

import ru.sidvi.account_tools.model.Account;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public interface AccountValidator {
    boolean validate(Account account);
}
