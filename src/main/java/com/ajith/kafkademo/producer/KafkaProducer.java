package com.ajith.kafkademo.producer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducer {
    private final KafkaTemplate<String ,String> kafkaTemplate;

    public void sentMessage(String message)
    {
        log.info("Sending message to topic first" + message);
        kafkaTemplate.send (    "first-topic" ,message );
    }
}
