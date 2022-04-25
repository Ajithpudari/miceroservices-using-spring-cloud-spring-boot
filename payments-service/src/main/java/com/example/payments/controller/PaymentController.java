package com.example.payments.controller;



import com.example.payments.entity.Payment;
import com.example.payments.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    PaymentService service;
    @RequestMapping("/doPayment")
    public Payment doPayment(@RequestBody Payment payment){
        return service.doPayment(payment);
    }
    @GetMapping("/{orderId}")
    public Payment getPayment(@PathVariable int orderId){
        return service.findByOrderId(orderId);
    }



}
