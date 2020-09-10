package com.lambdaschool.javaorders2.services;

import com.lambdaschool.javaorders2.models.Payment;
import com.lambdaschool.javaorders2.repos.PaymentsRepo;
import org.springframework.beans.factory.annotation.Autowired;

public class PaymentServicesImpl implements PaymentServices {
    @Autowired
    PaymentsRepo paymentsRepo;
    @Autowired
    public Payment save(Payment payment) { return paymentsRepo.save(payment); }

}
