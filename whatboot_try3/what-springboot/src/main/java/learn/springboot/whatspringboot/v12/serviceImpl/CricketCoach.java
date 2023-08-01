package learn.springboot.whatspringboot.v12.serviceImpl;

import learn.springboot.whatspringboot.v12.service.Coach;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class CricketCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice 5hr Daily using bat";
    }

}
