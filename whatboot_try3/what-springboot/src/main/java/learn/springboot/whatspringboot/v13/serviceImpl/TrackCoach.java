package learn.springboot.whatspringboot.v13.serviceImpl;

import learn.springboot.whatspringboot.v13.service.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class TrackCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice 7hr Daily in Round Ground";
    }



}
