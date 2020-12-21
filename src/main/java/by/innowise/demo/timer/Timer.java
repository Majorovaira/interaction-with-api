package by.innowise.demo.timer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@Slf4j
@Component
public class Timer {



    @PostConstruct
    public void printMinutesUntilNewYear() {
        ScheduledExecutorService service = Executors.newScheduledThreadPool(5);

        Runnable task1 = () -> {
            LocalDateTime now = LocalDateTime.now();
            LocalDateTime newYear =LocalDateTime.of(now.getYear() + 1, 01, 01, 00, 00, 00);
            Duration duration = Duration.between(now, newYear);
            long diff = duration.toMinutes();
            log.info("Minutes until New Year " + diff);
        };
        service.scheduleWithFixedDelay(task1, 0, 6, TimeUnit.SECONDS);


        for (int i = 5; i > 0; i --) {
            int finalI = i;
            service.scheduleWithFixedDelay(() -> {
                log.info("wait " + finalI + " sec");
            }, 5 - i + 1, 6, TimeUnit.SECONDS);
        }
    }


}
