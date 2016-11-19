package ru.sidvi.account_tools.refs;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public enum AccountType {

    PERSONAL("40817"),
    PERSONAL_IP("40802"),
    BUDGET("40100"),
    SUBJECT_RF("40200"),
    FEDERAL_ORGANIZATION("40500"),
    FOREIGN_PERSONAL("45700");

    private String value;

    AccountType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static AccountType fromString(String value) {
        for (AccountType type : AccountType.values()) {
            if (type.getValue().equals(value)) {
                return type;
            }
        }
        return null;
    }
}
