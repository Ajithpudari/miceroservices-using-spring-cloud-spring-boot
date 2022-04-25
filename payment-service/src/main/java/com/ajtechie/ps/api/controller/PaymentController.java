package com.ajtechie.ps.api.controller;


import com.ajtechie.ps.api.entity.Payment;
import com.ajtechie.ps.api.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService service;
    @RequestMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }




}
