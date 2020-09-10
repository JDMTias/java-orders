package com.lambdaschool.javaorders2.repos;

import com.lambdaschool.javaorders2.models.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrdersRepo extends CrudRepository<Order, Long> {

}
