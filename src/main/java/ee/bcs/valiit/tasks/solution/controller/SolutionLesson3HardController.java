package ee.bcs.valiit.tasks.solution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.Scanner;

@RequestMapping("solution/lesson3hard")
@RestController
public class SolutionLesson3HardController {

    Random random = new Random();
    int count = 0;
    int randomNumber = random.nextInt(100);

    @GetMapping("guess")
    public String guess(int myGuess){
            count++;
            if (myGuess == randomNumber) {
                int oldCound = count;
                count = 0;
                randomNumber = random.nextInt(100);
                return "Arvasid ära " + oldCound + " korraga";
            } else if(count >= 10){
                count = 0;
                int oldRandomNumber = randomNumber;
                randomNumber = random.nextInt(100);
                return "Ei arvanud ära. Tegelik number oli: " + oldRandomNumber;
            } else if (myGuess > randomNumber) {
                return "Number oli väiksem";
            } else {
                return "Number oli suurem";
            }
    }

}
