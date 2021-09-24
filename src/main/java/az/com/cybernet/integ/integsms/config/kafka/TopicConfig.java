package az.com.cybernet.integ.integsms.config.kafka;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TopicConfig {

    public NewTopic topicMessages() {
        return new NewTopic("topicName", 1, (short) 1);
    }
}
