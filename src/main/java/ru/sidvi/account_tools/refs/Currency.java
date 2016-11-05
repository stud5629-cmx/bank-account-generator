package ru.sidvi.account_tools.refs;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public enum Currency {

    RUB("810"),
    EUR("978"),
    USD("840");

    private String value;

    Currency(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
