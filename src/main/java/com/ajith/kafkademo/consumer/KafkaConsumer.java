package com.ajith.kafkademo.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "first-topic" ,groupId = "myGroup")
    public void consumeMsg(String message)
    {
        log.info ( String.format ( "consuming the message first-topic :: %s",message ) );
    }
}
