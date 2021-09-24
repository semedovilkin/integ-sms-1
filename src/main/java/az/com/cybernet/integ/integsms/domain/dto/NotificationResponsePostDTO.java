package az.com.cybernet.integ.integsms.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationResponsePostDTO {

    @JsonProperty("notification_id")
    private Long notificationId;

    @JsonProperty("message")
    private String message;

}

