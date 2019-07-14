package com.valandro;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class Consumer {

    private CountDownLatch latch = new CountDownLatch(100000);

    @KafkaListener(topics = "one-queue", groupId = "one")
    public void listen(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
