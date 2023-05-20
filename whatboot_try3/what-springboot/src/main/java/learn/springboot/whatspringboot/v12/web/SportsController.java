package learn.springboot.whatspringboot.v12.web;

import learn.springboot.whatspringboot.v12.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsController {

    private final Coach myCoach;

    @Autowired
    public SportsController(Coach myCoach) {
        this.myCoach=myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}
