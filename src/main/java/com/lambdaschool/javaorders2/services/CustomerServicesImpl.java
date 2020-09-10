package com.lambdaschool.javaorders2.services;

import com.lambdaschool.javaorders2.models.Customer;
import com.lambdaschool.javaorders2.repos.CustomerRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "customerServices")
public class CustomerServicesImpl implements CustomerServices {

    @Autowired
    CustomerRepos custrepo;
    @Override
    public Customer save(Customer customer) { return custrepo.save(customer);}

}
