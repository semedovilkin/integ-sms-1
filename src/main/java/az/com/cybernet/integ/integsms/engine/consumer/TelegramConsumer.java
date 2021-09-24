package az.com.cybernet.integ.integsms.engine.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class TelegramConsumer {

    private static final String TOPIC = "telegram";

    @KafkaListener(topics = TOPIC, groupId = "sms_group_id")
    public void consume(String message) {
        log.info("consumer message: " + message);
    }
}
