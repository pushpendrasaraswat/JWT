package com.ps.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.ps.jwt.dao.User;
import com.ps.jwt.model.Customer;
import com.ps.jwt.repository.CustomerRepository;

@Service
public class UserService {

    @Autowired
    CustomerRepository customerRepository;


    @Autowired
    PasswordEncoder passwordEncoder;

    public Customer findByEmail(String userName) {

        List<Customer> customers = customerRepository.findByEmail(userName);
        if (CollectionUtils.isEmpty(customers)) {
            throw new BadCredentialsException("No user registered with the details");
        }
        return customers.get(0);


    }

    public User saveUser(User user) {

        Customer customer = Customer.builder().email(user.getEmail()).pwd(passwordEncoder.encode(user.getPassword())).role(user.getRole()).build();
        Customer savedCustomer = customerRepository.save(customer);
        user.setId(savedCustomer.getId());
        return user;
    }
}
