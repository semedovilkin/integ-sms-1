package az.com.cybernet.integ.integsms.service;


import az.com.cybernet.integ.integsms.domain.dto.AccountHistoryResponseDTO;
import az.com.cybernet.integ.integsms.domain.dto.AccountPostDTO;

public interface AccountService {
    void createAccount(AccountPostDTO accountDto);

    AccountHistoryResponseDTO getAccountHistory(long id);
}
