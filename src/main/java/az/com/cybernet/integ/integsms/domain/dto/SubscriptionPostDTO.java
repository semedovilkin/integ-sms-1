package az.com.cybernet.integ.integsms.domain.dto;

import az.com.cybernet.integ.integsms.domain.enumeration.NotificationTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubscriptionPostDTO {
    @JsonProperty("phone")
    private String phone;

    @JsonProperty("notification_types")
    private NotificationTypeEnum notificationTypes;
}

