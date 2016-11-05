package ru.sidvi.account_tools.generator;

import ru.sidvi.account_tools.model.Account;
import ru.sidvi.account_tools.model.Bic;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class KeyGenerator {

    public static final int JOINED_ACCOUNT_SIZE = 23;
    public static final int RADIX = 10;
    private static int[] algKoef = new int[JOINED_ACCOUNT_SIZE];

    static {
        int[] koef = {7, 1, 3};
        for (int i = 0; i < JOINED_ACCOUNT_SIZE; i++) {
            algKoef[i] = koef[i % 3];
        }
    }

    public String generate(Bic bic, Account account) {
        String fullAccount = bic.getOrganizationCode() + account.getWitoutKey();
        int[] multiplyBuf = multiplyKoefToDigits(fullAccount);
        int sum = calcSumOfLastDigit(multiplyBuf);
        return Integer.toString(getLastDigit(getLastDigit(sum) * 3));
    }

    private int[] multiplyKoefToDigits(String account) {
        int sumBuf[] = new int[JOINED_ACCOUNT_SIZE];
        char[] accNumbers = account.toCharArray();
        for (int i = 0; i < JOINED_ACCOUNT_SIZE; i++) {
            sumBuf[i] = getDigit(accNumbers[i]) * algKoef[i];
        }
        return sumBuf;
    }

    private int getDigit(char accNumber) {
        return Character.digit(accNumber, RADIX);
    }

    private int calcSumOfLastDigit(int[] value) {
        int sum = 0;
        for (int i : value) {
            sum += getLastDigit(i);
        }
        return sum;
    }

    public int getLastDigit(int number) {
        return number % RADIX;
    }
}
