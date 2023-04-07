package learn.springboot.whatspringboot.v11.controller;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;

@RestController
public class FunRestController {
    
    @Value("${info.app.name}")
    private String appName;

    @Value("${info.app.version}")
    private String appVersion;

    //
    @RequestMapping("/hello")
    public String sayHello() {
        return "Welcome "+appName+" version:"+appVersion;
    }
    @GetMapping(path = "/list",  produces = MediaType.APPLICATION_JSON_VALUE) 
    // @GetMapping(path = "/list", consumes = "application/json" ) // Content-Type is not supported
    public List getList() {

        List temp = new ArrayList<Integer>();
        temp.add(1);
        temp.add(2);
        return temp;
    }
    
}
