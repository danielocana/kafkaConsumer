package com.example.spring.service;

import com.example.spring.repository.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(Sink.class)
public class InputKafkaMessage {

    @Autowired
    private PersonRepository personRepository;

    private static final Logger LOGGER = LoggerFactory.getLogger(InputKafkaMessage.class);

    @StreamListener(Sink.INPUT)
    public void handle(Person person) {
        LOGGER.info("Insert this person name" + person.getName());
        personRepository.save(person);
    }
}
