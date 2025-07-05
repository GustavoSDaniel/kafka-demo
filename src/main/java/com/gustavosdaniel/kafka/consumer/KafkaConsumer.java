package com.gustavosdaniel.kafka.consumer;

import com.gustavosdaniel.kafka.payload.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import static java.lang.String.format;

@Service
@Slf4j
public class KafkaConsumer {

    // @KafkaListener(topics = "topic1", groupId = "myGroup")
    public void consumeMsg(String msg) {
        log.info(format("Consuming the message from gustavo Topic:: %s ", msg));


    }

    @KafkaListener(topics = "topic1", groupId = "myGroup")
    public void consumeMsg(Customer customer) {
        log.info(format("Consuming the message from gustavo Topic:: %s ", customer.toString()));


    }
}
