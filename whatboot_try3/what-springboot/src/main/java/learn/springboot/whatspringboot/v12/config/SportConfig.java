package learn.springboot.whatspringboot.v12.config;

import learn.springboot.whatspringboot.v12.service.Coach;
import learn.springboot.whatspringboot.v12.serviceImpl.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class SportConfig {

    @Bean
    @Primary
    public Coach mySwimCoach() {
        return new SwimCoach();
    }
}
