package com.customerapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.customerapp.constants.AppConstants;
import com.customerapp.entity.Order;

@Service
public class OrderService {

	@Autowired
	private KafkaTemplate<String, Order> kafkaTemplate;
    //url of kafka, JSonSerializer, StringSerializer(No)
	public String addMsg(Order order) {

		// sends msg to kafka topic
		kafkaTemplate.send(AppConstants.TOPIC, order);

		return "Msg Published To Kafka Topic";
	}
}