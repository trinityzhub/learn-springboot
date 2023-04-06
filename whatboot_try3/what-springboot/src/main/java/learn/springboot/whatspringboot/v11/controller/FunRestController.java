package learn.springboot.whatspringboot.v11.controller;

import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    
    //
    @RequestMapping("/hello")
    public String sayHello() {
        return "Hi Hello";
    }
    @RequestMapping("/list", pro)
    public List getList() {

        List temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        return temp;
    }
}
