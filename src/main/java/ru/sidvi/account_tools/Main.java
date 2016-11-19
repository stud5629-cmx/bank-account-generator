package ru.sidvi.account_tools;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import ru.sidvi.account_tools.generator.KeyGenerator;
import ru.sidvi.account_tools.model.Account;
import ru.sidvi.account_tools.model.Bic;
import ru.sidvi.account_tools.refs.AccountType;
import ru.sidvi.account_tools.refs.Currency;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class Main {

    @Parameter(names = {"-c", "--currency"})
    private Currency currency = Currency.RUB;

    @Parameter(names = {"-t", "--type"})
    private AccountType type = AccountType.PERSONAL;

    @Parameter(names = {"-b", "--bic"})
    private Bic bic = new Bic("1230221121");

    private KeyGenerator generator = new KeyGenerator();

    private void run() {
        Account account = Account.create(type, currency);
        String key = generator.generate(bic, account);
        account.updateKey(key);

        System.out.println(account);
    }

    public static void main(String[] args) {
        Main main = new Main();
        new JCommander(main, args);
        main.run();
    }
}
