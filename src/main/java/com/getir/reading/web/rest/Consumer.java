package com.getir.reading.web.rest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "test")
    public void processMessage(String content){
        System.out.println();
    }
}
