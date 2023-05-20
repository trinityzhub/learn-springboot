package learn.springboot.whatspringboot.v12.serviceImpl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import learn.springboot.whatspringboot.v12.service.Coach;


// Not using @Component , Instead of We have a bean at SportConfig
public class SwimCoach implements Coach {



    @Override
    public String getDailyWorkout() {
        return "Swim 1 hr";
    }


/*

    @PostConstruct
    public void printNamePostConstruct() {
        printSimpleName("PostConstruct");
    }

    @PreDestroy
    public void printNamePreDestroy() {
        printSimpleName("PreDestroy");
    }

*/

    private void printSimpleName(String situvation) {
        System.out.println("Get Class Name @"+situvation+": "+ getClass().getSimpleName());
    }


}
