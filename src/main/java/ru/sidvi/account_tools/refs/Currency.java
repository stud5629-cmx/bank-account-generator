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

    public String getValue() {
        return value;
    }

    public static Currency fromString(String value) {
        for (Currency type : Currency.values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }
}
