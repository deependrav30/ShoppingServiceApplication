package com.stickyio.customerservice.service;

import com.stickyio.customerservice.dao.Customer;
import com.stickyio.customerservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public Long createCustomer(Customer customer) {
        customer=customerRepository.save(customer);
        return customer.getId();
    }

    public Customer getCustomer(String emailId){

        return customerRepository.getByEmailId(emailId);
    }

}
