package com.ajith.kafkademo.controller;

import com.ajith.kafkademo.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final KafkaProducer kafkaProducer;
    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message)
    {
        kafkaProducer.sentMessage ( message );
        return ResponseEntity.ok ( message );
    }
}
