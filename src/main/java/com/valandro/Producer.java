package com.valandro;

import com.valandro.data.*;
import com.valandro.repository.*;
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
    private Entries100Repository respository;
    private final Consumer consumer;

    private final static String FEMALE_TOPIC = "female";
    private final static String MALE_TOPIC = "male";

    @Override
    public void run(String... args) throws Exception {
        List<Entries100> entries = respository.findAll();
        System.out.println("Sending messages...");
        entries.forEach(e -> {
            if (e.getGender().equals("Female")) {
                kafkaTemplate.send(FEMALE_TOPIC, e.getFirstName());
            } else {
                kafkaTemplate.send(MALE_TOPIC, e.getFirstName());
            }
        });
        consumer.getLatch().await(100, TimeUnit.MILLISECONDS);
    }

}
