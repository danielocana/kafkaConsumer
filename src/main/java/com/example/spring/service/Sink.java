package com.example.spring.service;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

interface Sink {
    String INPUT = "rancheros";

    @Input(Sink.INPUT)
    SubscribableChannel input();
}
