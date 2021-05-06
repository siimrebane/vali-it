package ee.bcs.valiit.solution.scheduler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TestJob {


    @Scheduled(fixedDelay = 1000)
    public void test(){
        System.out.println("läks tööle" + LocalDateTime.now());
    }
}
