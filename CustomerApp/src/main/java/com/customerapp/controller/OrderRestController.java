package com.customerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customerapp.entity.Order;
import com.customerapp.service.OrderService;

@RestController
@RequestMapping("/api/v1/order")
public class OrderRestController {

	@Autowired
	private OrderService service;

	@PostMapping("/create")
	public String createOrder(@RequestBody Order order) {
		String response = service.addMsg(order);
		return response;
	}

}