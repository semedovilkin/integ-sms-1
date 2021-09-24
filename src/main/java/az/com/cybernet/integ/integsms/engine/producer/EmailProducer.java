package az.com.cybernet.integ.integsms.engine.producer;

import az.com.cybernet.integ.integsms.domain.dto.UserKafkaDTO;
import az.com.cybernet.integ.integsms.engine.publiser.KafkaMsgPublisher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmailProducer {
    private final KafkaMsgPublisher kafkaMsgPublisher;
    private static final String TOPIC = "email";

    public void sendMessage(UserKafkaDTO message) {
        log.info("sending message: " + message);
        kafkaMsgPublisher.publish(null, message, TOPIC);
    }
}