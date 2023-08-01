package learn.springboot.whatspringboot.v13.serviceImpl;


import learn.springboot.whatspringboot.v13.dao.CustomerRepository;
import learn.springboot.whatspringboot.v13.dto.CustomerData;
import learn.springboot.whatspringboot.v13.entity.Customer;
import learn.springboot.whatspringboot.v13.util.CustomerDataUtil;
import learn.springboot.whatspringboot.v13.service.CustomerService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    private CustomerRepository myDataSource;

    @Autowired
    private CustomerDataUtil util;


    /**
     * Create a customer based on the data sent to the service class.
     * @param customer
     * @return DTO representation of the customer
     */
    @Override
    public CustomerData save(CustomerData customer) {
        Customer customerModel = util.populateCustomerEntity(customer);
        return util.populateCustomerData(myDataSource.save(customerModel));
    }



    @Override
    public List <CustomerData> getAllCustomers() {
        List < CustomerData > customers = new ArrayList < > ();
        List <Customer> customerList = myDataSource.findAll();
        customerList.forEach(customer -> {
                customers.add(util.populateCustomerData(customer));
        });
        return customers;
    }


}
