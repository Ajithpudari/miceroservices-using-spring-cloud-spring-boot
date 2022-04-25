package com.ajtechie.ors.api.controller;

import com.ajtechie.ors.api.common.TransactionRequest;
import com.ajtechie.ors.api.common.TransactionResponse;
import com.ajtechie.ors.api.entity.Order;
import com.ajtechie.ors.api.service.OrderService;
import com.fasterxml.jackson.core.JsonProcessingException;
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
     public TransactionResponse bookOrder(@RequestBody TransactionRequest request) throws JsonProcessingException {
        //do a rest call to payment api

       return service.saveOrder(request);
    }


}
