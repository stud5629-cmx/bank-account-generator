package ru.sidvi.account_tools.model;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class Account {

    private String value;

    public Account(String value) {
        this.value = validate(clean(value));
    }

    private String clean(String value) {
        return value.replaceAll(" ", "");
    }

    private String validate(String value) {
        if (value.length() != 20) {
            throw new IllegalArgumentException("Account must contain 20 digit.");
        }
        return value;
    }

    public String getValue() {
        return value;
    }

    public String getBallanceAccount() {
        return value.substring(0, 5);
    }

    public String getCurrencyCode() {
        return value.substring(5, 8);
    }

    public String getKey() {
        return value.substring(8, 9);
    }

    public String getSubdivision() {
        return value.substring(9, 13);
    }

    public String getAccount() {
        return value.substring(13);
    }

    public String getWitoutKey() {
        return repaceKey('0');
    }

    public void changeKey(String key) {
        value = repaceKey(key.charAt(0));
    }

    private String repaceKey(char key) {
        StringBuilder buf = new StringBuilder(value);
        buf.setCharAt(8, key);
        return buf.toString();
    }
}

