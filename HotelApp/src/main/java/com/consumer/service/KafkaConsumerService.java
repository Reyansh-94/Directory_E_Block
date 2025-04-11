package com.consumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.consumerapp.constants.AppConstants;

@Service
public class KafkaConsumerService {

    private String latestMessage; // Stores the latest Kafka message

    @KafkaListener(topics = AppConstants.TOPIC, groupId = "group_customer_order")
    public void consumeMessage(String order) {
        System.out.println("_____________ Msg fetched from Kafka _________________");
        System.out.println(order);
        this.latestMessage = order; // Store the message for retrieval
    }

    public String getLatestMessage() {
        return latestMessage; // Expose latest message for the controller
    }
}