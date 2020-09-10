package com.lambdaschool.javaorders2.repos;

import com.lambdaschool.javaorders2.models.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomersRepo extends CrudRepository<Customer, Long> {

}
