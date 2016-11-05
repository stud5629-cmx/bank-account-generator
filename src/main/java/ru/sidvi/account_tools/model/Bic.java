package ru.sidvi.account_tools.model;

/**
 * @author Vitaly Sidorov mail@vitaly-sidorov.com
 */
public class Bic {
    public static final String RUSSIAN_FECERATION = "04";
    private String value;

    public Bic(String value) {
        this.value = validate(value);
    }

    private String validate(String value) {
        return value;
    }

    public String getValue() {
        return value;
    }

    public String getTerritoryCode() {
        return value.substring(2, 4);
    }

    public String getDivisionCode() {
        return value.substring(4, 6);
    }

    public String getOrganizationCode() {
        return value.substring(6, 9);
    }

    public String getCountryCode() {
        return RUSSIAN_FECERATION;
    }
}
