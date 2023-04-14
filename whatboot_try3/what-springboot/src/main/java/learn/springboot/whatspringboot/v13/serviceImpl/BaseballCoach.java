package learn.springboot.whatspringboot.v13.serviceImpl;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import learn.springboot.whatspringboot.v13.service.Coach;
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


}
