package com.valandro;

import com.valandro.data.Entries100;
import com.valandro.data.Entries100000;
import com.valandro.repository.Entries100000Respository;
import com.valandro.repository.Entries100Repository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Component
@AllArgsConstructor
public class Producer implements CommandLineRunner {

    private KafkaTemplate<String, String> kafkaTemplate;
    private Entries100000Respository respository;
    private final Consumer consumer;

    private final static String TOPIC = "one-queue";

    @Override
    public void run(String... args) throws Exception {
        List<Entries100000> entries = respository.findAll();
        System.out.println("Sending messages...");
        entries.forEach(e -> {
            kafkaTemplate.send(TOPIC, e.getFirstName());
        });
        consumer.getLatch().await(100, TimeUnit.MILLISECONDS);
    }

}
