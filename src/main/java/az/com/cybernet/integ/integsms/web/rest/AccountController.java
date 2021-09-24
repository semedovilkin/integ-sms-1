package az.com.cybernet.integ.integsms.web.rest;

import az.com.cybernet.integ.integsms.domain.dto.AccountHistoryResponseDTO;
import az.com.cybernet.integ.integsms.domain.dto.AccountPostDTO;
import az.com.cybernet.integ.integsms.service.AccountService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/account")
public class AccountController {
    private final AccountService accountService;

    @ApiOperation(value = "Create account", nickname = "createAccount", response = Object.class)
    @ResponseStatus(HttpStatus.CREATED)
    public void createAccount(@ApiParam(value = "Created account object", required = true)
                              @Valid @RequestBody AccountPostDTO request) {
        accountService.createAccount(request);
    }

    @ApiOperation(value = "Get account history", nickname = "getAccountHistory", response = AccountHistoryResponseDTO.class)
    @GetMapping("/{accountId}")
    public ResponseEntity<AccountHistoryResponseDTO> getAccountHistory(@ApiParam(value = "", required = true)
                                                                       @PathVariable("accountId") long accountId) {
        return ResponseEntity.ok(accountService.getAccountHistory(accountId));
    }

}
