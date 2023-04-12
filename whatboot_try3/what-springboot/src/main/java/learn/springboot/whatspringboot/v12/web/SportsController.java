package learn.springboot.whatspringboot.v12.web;

import learn.springboot.whatspringboot.v12.service.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SportsController {

    private final Coach myCoach;
    private  Coach specialCoach;

    @Autowired
    public SportsController(Coach myCoach) {
        this.myCoach=myCoach;
    }

/*
    @Autowired
    public void setMyCoach(Coach myCoach) {
        System.out.println("setMyCoach-------------------");
        this.myCoach = myCoach;
    }

*/

    @Autowired
    public void methodInjection(@Qualifier("baseballCoach") Coach specialCoach) {
        System.out.println("setMyCoach-------------------");
        this.specialCoach = specialCoach;
    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


    @GetMapping("/spl/dailyworkout")
    public String getSpecialDailyWorkout() {
        return specialCoach.getDailyWorkout();
    }

}
