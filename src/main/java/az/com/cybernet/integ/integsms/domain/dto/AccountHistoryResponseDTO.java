package az.com.cybernet.integ.integsms.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccountHistoryResponseDTO {
    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("history")
    private List<AccountHistoryListResponseDTO> history;

}

