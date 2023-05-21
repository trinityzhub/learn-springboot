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

    /**
     * Method to map the front end customer object to the JPA customer entity.
     * @param customerData
     * @return Customer
     */
    private Customer populateCustomerEntity(CustomerData customerData) {
        Customer customer = new Customer();
        customer.setFirstName(customerData.getFirstName());
        customer.setLastName(customerData.getLastName());
        customer.setEmail(customerData.getEmail());
        return customer;
    }




    /**
     * Create a customer based on the data sent to the service class.
     * @param customer
     * @return DTO representation of the customer
     */
    @Override
    public CustomerData save(CustomerData customer) {
        Customer customerModel = populateCustomerEntity(customer);
        return populateCustomerData(customerRepository.save(customerModel));
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
