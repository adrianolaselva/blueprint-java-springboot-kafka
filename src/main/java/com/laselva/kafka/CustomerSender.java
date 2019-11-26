package com.laselva.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class CustomerSender {

    private static final Logger log = LoggerFactory.getLogger(CustomerSender.class);
    private final KafkaTemplate<String, Object> template;

    public CustomerSender(final KafkaTemplate<String, Object> template) {
        this.template = template;
    }

    @Scheduled(fixedDelay = 3000L)
    public void sendMessage() {
        try{
            log.info("send message to kafka");
            this.template.send(
                    "customer-topic", String.valueOf(Instant.now()), new Customer("teste"));
        }catch (Exception ex){
            log.error("failed to send message to topic {}", ex.getMessage());
        }
    }
}
