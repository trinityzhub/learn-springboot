package learn.springboot.whatspringboot.v13.service;

import learn.springboot.whatspringboot.v13.dto.CustomerData;

import java.util.*;

public interface CustomerService {
    CustomerData save(CustomerData customer);

    List <CustomerData> getAllCustomers();
}
