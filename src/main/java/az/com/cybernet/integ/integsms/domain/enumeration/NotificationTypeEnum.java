package az.com.cybernet.integ.integsms.domain.enumeration;

import com.fasterxml.jackson.annotation.JsonCreator;

public enum NotificationTypeEnum {
    SMS("sms"),

    TELGRAM("telegram"),

    EMAIL("email"),

    WHATSAPP("whatsapp"),

    ISO("iso"),

    ANDOID("android");

    private final String value;

    NotificationTypeEnum(String value) {
        this.value = value;
    }

    @JsonCreator
    public static NotificationTypeEnum fromValue(String text) {
        for (NotificationTypeEnum b : NotificationTypeEnum.values()) {
            if (String.valueOf(b.value).equals(text)) {
                return b;
            }
        }
        return null;
    }
}