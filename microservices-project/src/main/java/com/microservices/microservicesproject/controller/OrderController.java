package com.microservices.microservicesproject.controller;

import com.microservices.microservicesproject.common.Payment;
import com.microservices.microservicesproject.common.TransactionRequest;
import com.microservices.microservicesproject.common.TransactionResponse;
import com.microservices.microservicesproject.entity.Order;
import com.microservices.microservicesproject.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/bookOrder")
    public TransactionResponse bookOrder(@RequestBody TransactionRequest request)
    {

        return service.saveOrder(request);
     }
}
