package ru.sidvi.account_tools;

import ru.sidvi.account_tools.generator.KeyGenerator;
import ru.sidvi.account_tools.model.Account;
import ru.sidvi.account_tools.model.Bic;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class Main {

    public static void main(String[] args) {
        KeyGenerator generator = new KeyGenerator();

        Bic bic= new Bic("1230221121");
        Account account = new Account("11111111111111111111");

        String key = generator.generate(bic, account);

        System.out.println();
        System.out.println(key);
    }
}
