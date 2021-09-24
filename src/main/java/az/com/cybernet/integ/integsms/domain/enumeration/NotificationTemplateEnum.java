package az.com.cybernet.integ.integsms.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum NotificationTemplateEnum {
    CUSTOM("custom"),

    LATEST_CHANGES("latest_changes"),

    DEBTS("debts");

    private final String value;

    NotificationTemplateEnum(String value) {
        this.value = value;
    }

    @JsonCreator
    public static NotificationTemplateEnum fromValue(String text) {
        for (NotificationTemplateEnum b : NotificationTemplateEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}
