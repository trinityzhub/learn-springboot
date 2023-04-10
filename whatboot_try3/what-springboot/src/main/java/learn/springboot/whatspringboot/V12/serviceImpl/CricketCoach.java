package learn.springboot.whatspringboot.V12.serviceImpl;

import learn.springboot.whatspringboot.V12.service.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice 5hr Daily";
    }

}
