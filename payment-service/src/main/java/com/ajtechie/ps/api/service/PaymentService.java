package com.ajtechie.ps.api.service;


import com.ajtechie.ps.api.entity.Payment;
import com.ajtechie.ps.api.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;

 public Payment doPayment(Payment payment){
     payment.setPaymentStatus(paymentProcessing());
     payment.setTransactionId(UUID.randomUUID().toString());
     return paymentRepository.save(payment);
 }
    public String paymentProcessing(){
        //this api call should payment gateway like paypall paytm...
        return new Random().nextBoolean()?"success":"false";
    }

}
