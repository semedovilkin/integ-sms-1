package az.com.cybernet.integ.integsms.web.rest;

import az.com.cybernet.integ.integsms.domain.dto.NotificationPostDTO;
import az.com.cybernet.integ.integsms.domain.dto.NotificationResponseDTO;
import az.com.cybernet.integ.integsms.domain.dto.NotificationResponsePostDTO;
import az.com.cybernet.integ.integsms.domain.dto.NotificationSendGroupPostDTO;
import az.com.cybernet.integ.integsms.service.NotificationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/notification")
public class NotificationController {
    private final NotificationService notificationService;

    @ApiOperation(value = "Get notification", nickname = "getNotification", response = NotificationResponseDTO.class)
    @GetMapping("/{notificationId}")
    public ResponseEntity<NotificationResponseDTO> getNotification(@ApiParam(value = "", required = true)
                                                                   @PathVariable("notificationId") long notificationId) {
        return ResponseEntity.ok(notificationService.getNotification(notificationId));
    }

    @ApiOperation(value = "Notification response", nickname = "response")
    @PostMapping("/action")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveNotificationAction(@ApiParam(value = "Send notification object", required = true)
                         @Valid @RequestBody NotificationResponsePostDTO request) {
        notificationService.saveNotificationAction(request);
    }

    @ApiOperation(value = "Send Group notification", nickname = "sendGroupNotification", response = Object.class)
    @PostMapping("/group/send")
    public ResponseEntity<Object> sendGroupNotification(@ApiParam(value = "Send group notification object", required = true)
                                                        @Valid @RequestBody NotificationSendGroupPostDTO request) {
        return notificationService.sendGroupNotification(request);
    }

//    @ApiOperation(value = "Send notification", nickname = "sendNotification", response = Object.class)
//    @PostMapping("/send")
//    public ResponseEntity<Object> sendNotification(@ApiParam(value = "Send notification object", required = true)
//                                                               Valid @RequestBody NotificationPostDTO body) {
//        return null;
//    }

}
