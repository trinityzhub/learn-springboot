package learn.springboot.whatspringboot.v12.serviceImpl;

import learn.springboot.whatspringboot.v12.service.Coach;
import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice 2hr Daily in BALL";
    }

    static {
        System.out.println("---------------BaseballCoach-------------------");
    }

}
