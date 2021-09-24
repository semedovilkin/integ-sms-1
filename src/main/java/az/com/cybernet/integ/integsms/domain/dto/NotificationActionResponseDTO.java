package az.com.cybernet.integ.integsms.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationActionResponseDTO {
    @JsonProperty("send_date")
    private String sendDate;

    @JsonProperty("code")
    private String code;

    @JsonProperty("message")
    private String message;
}

