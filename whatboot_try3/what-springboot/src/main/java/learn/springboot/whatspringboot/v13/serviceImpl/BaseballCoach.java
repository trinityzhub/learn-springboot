package learn.springboot.whatspringboot.v13.serviceImpl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import learn.springboot.whatspringboot.v12.service.Coach;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {


    @Override
    public String getDailyWorkout() {
        return "Practice 2hr Daily in BALL";
    }

    static {
        System.out.println("---------------BaseballCoach-------------------");
    }

    @PostConstruct
    public void printNamePostConstruct() {
        printSimpleName("PostConstruct");
    }

    @PreDestroy
    public void printNamePreDestroy() {
        printSimpleName("PreDestroy");
    }



    private void printSimpleName(String situvation) {
        System.out.println("Get Class Name @"+situvation+": "+ getClass().getSimpleName());
    }


}
