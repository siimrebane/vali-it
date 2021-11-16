package ee.bcs.valiit.solution;

import java.util.Random;
import java.util.Scanner;

public class Lesson3HardSolution {

    // TODO kirjuta mäng mis leiab suvalise numbri 0-99, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);
        System.out.println("Arva number ära (0-99):");
        System.out.println("Sisesta number");
        int count = 0;
        while(true){
            count++;
            int guess = scanner.nextInt();
            if (guess > randomNumber) {
                System.out.println("Arv on väiksem");
            } else if(guess < randomNumber){
                System.out.println("Arv on suurem");
            } else {
                System.out.println("Tubli arvasid ära");
                System.out.println("Sul läks " + count + " korda");
                break;
            }
        }
    }
}
