package az.com.cybernet.integ.integsms.web.rest;

import az.com.cybernet.integ.integsms.domain.dto.SubscriptionPostDTO;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("v1/subscription")
@RestController
public class SubscriptionController {

    @ApiOperation(value = "Create subscription", nickname = "createSubscription", response = Object.class)
    @PostMapping
    public ResponseEntity<Object> createSubscription(@ApiParam(value = "Created subscription object", required = true)
                                                         @Valid @RequestBody SubscriptionPostDTO body) {
        return null;
    }

    @ApiOperation(value = "remove subscribtion", nickname = "removeSubscription", response = Object.class)
    @DeleteMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeSubscription(@ApiParam(value = "Remove subscription object", required = true)
                                       @Valid @RequestBody SubscriptionPostDTO body) {

    }

}
