package az.com.cybernet.integ.integsms.domain.repository;

import az.com.cybernet.integ.integsms.domain.entity.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {
}
