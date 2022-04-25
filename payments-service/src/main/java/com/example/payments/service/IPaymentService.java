package com.example.payments.service;


import com.example.payments.entity.Payment;

public interface IPaymentService {



    Payment findByOrderId(int orderId);
}
