package az.com.cybernet.integ.integsms.service.impl;

import az.com.cybernet.integ.integsms.domain.dto.NotificationResponseDTO;
import az.com.cybernet.integ.integsms.domain.dto.NotificationResponsePostDTO;
import az.com.cybernet.integ.integsms.domain.dto.NotificationSendGroupPostDTO;
import az.com.cybernet.integ.integsms.domain.mapper.NotificationActionMapper;
import az.com.cybernet.integ.integsms.domain.mapper.NotificationMapper;
import az.com.cybernet.integ.integsms.domain.repository.NotificationActionRepository;
import az.com.cybernet.integ.integsms.domain.repository.NotificationRepository;
import az.com.cybernet.integ.integsms.exception.NotificationNotFoundException;
import az.com.cybernet.integ.integsms.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class NotificationServiceImpl implements NotificationService {
    private final NotificationRepository notificationRepository;
    private final NotificationActionRepository actionRepository;

    @Override
    public NotificationResponseDTO getNotification(long id) {
        return NotificationMapper.INSTANCE.entityToDto(notificationRepository.findById(id).
                orElseThrow(() -> new NotificationNotFoundException(id)));
    }

    @Transactional
    @Override
    public void saveNotificationAction(NotificationResponsePostDTO request) {
        actionRepository.save(NotificationActionMapper.INSTANCE.getEntity(request));
    }

    @Override
    public ResponseEntity<Object> sendGroupNotification(NotificationSendGroupPostDTO request) {

        return null;
    }
}
