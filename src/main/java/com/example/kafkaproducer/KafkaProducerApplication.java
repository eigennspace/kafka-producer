package com.example.kafkaproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
@EnableScheduling
public class KafkaProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaProducerApplication.class, args);
    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        helloKafkaProducer.sendHello("Harist " + ThreadLocalRandom.current().nextInt());
//    }
}