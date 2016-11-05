package ru.sidvi.account_tools;

import org.junit.Test;
import ru.sidvi.account_tools.generator.KeyGenerator;
import ru.sidvi.account_tools.model.Account;
import ru.sidvi.account_tools.model.Bic;

import static org.junit.Assert.*;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class KeyGeneratorTest {

    private KeyGenerator tested;

    @Test
    public void testGenerate() throws Exception {
        tested = new KeyGenerator();
        Bic bic = new Bic("049805746");
        Account account = new Account("40602 810 7 00000000025");

        String actual = tested.generate(bic, account);

        String key = account.getKey();

        assertEquals(key, actual);
    }
}