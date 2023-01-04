package com.example.kafkaproducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class HelloKafkaProducer {

    private static final Logger LOG = LoggerFactory.getLogger(HelloKafkaProducer.class);
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private AtomicInteger counter = new AtomicInteger();

    @Scheduled(fixedRate = 2000)
    public void sendHello(){
        var i = counter.getAndIncrement();
        LOG.info("counter is " + i);
        LOG.info("counter is " + i);
        kafkaTemplate.send("t-hello", "Hallo number " + i);
    }
}