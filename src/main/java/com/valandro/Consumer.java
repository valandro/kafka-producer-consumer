package com.valandro;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Consumer {

    private CountDownLatch latch = new CountDownLatch(100);

    @KafkaListener(topics = "male", groupId = "one")
    public void listenMale(String message) {
        System.out.println("Received Male <" + message + ">");
        latch.countDown();
    }

    @KafkaListener(topics = "female", groupId = "one")
    public void listen(String message) {
        System.out.println("Received Female <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
