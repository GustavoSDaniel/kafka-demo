package com.gustavosdaniel.kafka.controller;

import com.gustavosdaniel.kafka.payload.Customer;
import com.gustavosdaniel.kafka.producer.KafkaJsonProducer;
import com.gustavosdaniel.kafka.producer.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessagemController {

    private final KafkaProducer kafkaProducer;
    private final KafkaJsonProducer kafkaJsonProducer;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        kafkaProducer.sendMessage(message);

        return ResponseEntity.ok("Message queue sent successfully");
    }

    @PostMapping("/json")
    public ResponseEntity<String> sendMessage(@RequestBody Customer message) {

        kafkaJsonProducer.sendMessage(message);

        return ResponseEntity.ok("Message queue sent successfully as JSON" );
    }
}
