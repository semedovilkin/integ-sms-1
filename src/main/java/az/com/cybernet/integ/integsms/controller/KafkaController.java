package az.com.cybernet.integ.integsms.controller;

import az.com.cybernet.integ.integsms.domain.dto.UserKafkaDTO;
import az.com.cybernet.integ.integsms.engine.producer.EmailProducer;
//import az.com.cybernet.integ.integsms.engine.producer.TelegramProducer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "kafka")
@Slf4j
public class KafkaController {

    @Autowired
    private EmailProducer emailProducer;

//    @Autowired
//    private TelegramProducer telegramProducer;

    @PostMapping("/email")
    public ResponseEntity<?> sendEmail(@RequestBody UserKafkaDTO message) {
        emailProducer.sendMessage(message);
        return ResponseEntity.ok().build();
    }

//    @PostMapping("/telegram")
//    public ResponseEntity<?> sendTelegram(@RequestParam String message) {
//        telegramProducer.sendMessage(message);
//        return ResponseEntity.ok().build();
//    }

}
