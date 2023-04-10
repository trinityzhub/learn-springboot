package learn.springboot.whatspringboot.V12.web;

import learn.springboot.whatspringboot.V12.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsController {

    private Coach myCoach;

/*
    @Autowired
    public SportsController(Coach myCoach) {
        this.myCoach=myCoach;
    }
*/
/*
    @Autowired
    public void setMyCoach(Coach myCoach) {
        System.out.println("setMyCoach-------------------");
        this.myCoach = myCoach;
    }

*/
    @Autowired
    public void methodInjection(Coach myCoach) {
        System.out.println("setMyCoach-------------------");
        this.myCoach = myCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }



}
