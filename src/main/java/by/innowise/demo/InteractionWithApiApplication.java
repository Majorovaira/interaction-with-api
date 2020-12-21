package by.innowise.demo;

import by.innowise.demo.controllers.DogController;
import by.innowise.demo.entity.Dog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.TemporalUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@EnableFeignClients
@SpringBootApplication
@EnableScheduling
public class InteractionWithApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InteractionWithApiApplication.class, args);

    }

}
