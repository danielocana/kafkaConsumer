package com.example.spring.service;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Sink.class)
public class InputKafkaMessage {


    @StreamListener(Sink.INPUT)
    public void handle(Person person) {
        System.out.println("The name is: " + person.getName());
    }
}
