package ru.sidvi.account_tools;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public final class Util {

    private Util() {
    }

    public static String generateDigits(int count) {
        StringBuilder builder = new StringBuilder();
        for(int i = 1; i < count; i++){
            builder.append((int)(Math.random()*10));
        }
        return builder.toString();
    }
}
