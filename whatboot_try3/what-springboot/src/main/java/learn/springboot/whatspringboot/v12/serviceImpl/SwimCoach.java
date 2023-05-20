package learn.springboot.whatspringboot.v12.serviceImpl;

import learn.springboot.whatspringboot.v12.service.Coach;


// Not using @Component , Instead of We have a bean at SportConfig
public class SwimCoach implements Coach {



    @Override
    public String getDailyWorkout() {
        return "Swim 1 hr";
    }

}
