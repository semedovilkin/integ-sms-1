package az.com.cybernet.integ.integsms.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum AccountGroupEnum {
    ALL("all"),

    PHYSICAL("physical"),

    LEGAL("legal");

    private final String value;

    AccountGroupEnum(String value) {
        this.value = value;
    }

    @JsonCreator
    public static AccountGroupEnum fromValue(String text) {
        for (AccountGroupEnum b : AccountGroupEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}