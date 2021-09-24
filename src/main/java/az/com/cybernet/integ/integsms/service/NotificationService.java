package az.com.cybernet.integ.integsms.service;

import az.com.cybernet.integ.integsms.domain.dto.NotificationResponseDTO;
import az.com.cybernet.integ.integsms.domain.dto.NotificationResponsePostDTO;
import az.com.cybernet.integ.integsms.domain.dto.NotificationSendGroupPostDTO;
import org.springframework.http.ResponseEntity;

public interface NotificationService {
    NotificationResponseDTO getNotification(long notificationId);

    void saveNotificationAction(NotificationResponsePostDTO request);

    ResponseEntity<Object> sendGroupNotification(NotificationSendGroupPostDTO request);
}
