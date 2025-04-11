package com.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.service.KafkaConsumerService;

@RestController
@RequestMapping("/kafka")
public class KafkaMessageController {

    private final KafkaConsumerService kafkaConsumerService;

    public KafkaMessageController(KafkaConsumerService kafkaConsumerService) {
        this.kafkaConsumerService = kafkaConsumerService;
    }

    @GetMapping("/latest-message")
    public String getLatestKafkaMessage() {
        return kafkaConsumerService.getLatestMessage();
    }
}