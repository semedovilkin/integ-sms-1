package az.com.cybernet.integ.integsms.domain.repository;

import az.com.cybernet.integ.integsms.domain.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Long> {
}
