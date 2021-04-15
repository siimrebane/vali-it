package ee.bcs.valiit.solution.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.Scanner;

@RestController
public class SampleRandomGameController {
    int count = 0;
    Random random = new Random();
    int randomNumber = random.nextInt(100);

    @GetMapping("/sample/random/{x}")
    public String guessNumber(@PathVariable("x") int guess){

        count++;
        if (guess > randomNumber) {
            return "Number on väiksem";
        } else if(guess < randomNumber){
            return "Number on suurem";
        } else {
            String responseMessage = "Arvasid ära. Sul läks " + count + " korda";
            randomNumber = random.nextInt(100);
            count = 0;
            return responseMessage;
        }
    }
}
