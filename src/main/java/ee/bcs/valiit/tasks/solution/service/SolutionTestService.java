package ee.bcs.valiit.tasks.solution.service;

import ee.bcs.valiit.tasks.solution.DemoApplicationException;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

@Service
public class SolutionTestService {
    public void test() {
        System.out.println("Test exception begin");
        service();
        System.out.println("Test exception end");
    }

    private void service() {
        System.out.println("Test exception2 begin");
        repository();
        System.out.println("Test exception2 end");
    }

    private void repository() {
        System.out.println("Test exception3 begin");
        Random random = new Random();
        int x = random.nextInt(4);
        if(x == 1){
            throw new DemoApplicationException("Kontol ei ole piisavalt raha");
        } else if(x == 2){
            throw new NullPointerException();
        } else if (x == 3){
            throw new DemoApplicationException("Sellist kontot ei eksisteeri");
        }
        System.out.println("Test exception3 end");
    }
}
