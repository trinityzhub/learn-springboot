package learn.springboot.whatspringboot.v13.web;


import jakarta.annotation.Resource;
import learn.springboot.whatspringboot.v13.dto.CustomerData;
import learn.springboot.whatspringboot.v13.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {



    @Resource(name = "customerService")
    private CustomerService customerService;


    @GetMapping
    public List <CustomerData> getCustomers() {
        return customerService.getAllCustomers();
    }


}
