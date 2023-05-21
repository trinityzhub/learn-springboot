package learn.springboot.whatspringboot.v13.serviceImpl;


import learn.springboot.whatspringboot.v13.dao.CustomerRepository;
import learn.springboot.whatspringboot.v13.dto.CustomerData;
import learn.springboot.whatspringboot.v13.entity.Customer;
import learn.springboot.whatspringboot.v13.service.CustomerService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerRepository customerRepository;


    private CustomerData populateCustomerData(final Customer customer) {
        CustomerData customerData = new CustomerData();
        customerData.setId(customer.getId());
        customerData.setFirstName(customer.getFirstName());
        customerData.setLastName(customer.getLastName());
        customerData.setEmail(customer.getEmail());
        return customerData;
    }




    @Override
    public List <CustomerData> getAllCustomers() {
        List < CustomerData > customers = new ArrayList < > ();
        List <Customer> customerList = customerRepository.findAll();
        customerList.forEach(customer -> {
                customers.add(populateCustomerData(customer));
        });
        return customers;
    }


}
