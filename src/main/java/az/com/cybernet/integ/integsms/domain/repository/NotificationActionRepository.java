package az.com.cybernet.integ.integsms.domain.repository;

import az.com.cybernet.integ.integsms.domain.entity.NotificationAction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationActionRepository extends JpaRepository<NotificationAction, Long> {
}
