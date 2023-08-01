package learn.springboot.whatspringboot.v13.util;

import learn.springboot.whatspringboot.v13.dto.CustomerData;
import learn.springboot.whatspringboot.v13.entity.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CustomerDataUtil {


    public CustomerData populateCustomerData(final Customer customer) {
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
    public Customer populateCustomerEntity(CustomerData customerData) {
        Customer customer = new Customer();
        customer.setFirstName(customerData.getFirstName());
        customer.setLastName(customerData.getLastName());
        customer.setEmail(customerData.getEmail());
        return customer;
    }


}
