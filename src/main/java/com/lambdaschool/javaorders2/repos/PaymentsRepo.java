package com.lambdaschool.javaorders2.repos;

import com.lambdaschool.javaorders2.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentsRepo extends CrudRepository<Payment, Long> {

}
