//package az.com.cybernet.integ.integsms.engine.producer;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Service;
//
//@Service
//@Slf4j
//@RequiredArgsConstructor
//public class TelegramProducer {
//    private final KafkaTemplate<String, String> kafkaTemplate;
//    private static final String TOPIC = "telegram";
//
//    public void sendMessage(String message) {
//        log.info("sending message: " + message);
//        kafkaTemplate.send(TOPIC, message);
//    }
//}
