package learn.springboot.whatspringboot.v13.config;

import learn.springboot.whatspringboot.v13.service.Coach;
import learn.springboot.whatspringboot.v13.serviceImpl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach mySwimCoach() {
        return new SwimCoach();
    }
}
