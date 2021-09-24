package az.com.cybernet.integ.integsms.engine.publiser;

import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

public interface KafkaMsgPublisher {

    ListenableFuture<SendResult<Long, Object>> publish(Long key, Object value, String topic);
}