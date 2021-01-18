package ee.bcs.valiit.tasks.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class SolutionLesson3Hard {
    public static void main(String[] args) {
        System.out.println(morseCode("sos"));
        System.out.println(morseCode("siim"));
    }

    public static int evenFibonacci(int x) {
        int a = 0;
        int b = 1;
        int sum = 0;
        while (b <=x){
            if (b % 2 == 0) {
                sum += b;
            }
            int tmp = a;
            a = b;
            b = tmp + b;
        }
        return sum;
    }

    public static void randomGame() {
        // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
        // ja kasutaja peab saama uuesti arvata
        // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        int randomNumber = random.nextInt(100);
        while(true){
            count++;
            System.out.println("Sisesta number");
            int guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("Arvasid ära " + count + " korraga");
                break;
            } else if(count >= 10){
                System.out.println("Ei arvanud ära. Tegelik number oli: " + randomNumber);
                break;
            } else if (guess > randomNumber) {
                System.out.println("Number oli väiksem");
            } else {
                System.out.println("Number oli suurem");
            }
        }
    }

    public static String morseCode(String text) {
        // TODO kirjuta programm, mis tagastab sisestatud teksti morse koodis (https://en.wikipedia.org/wiki/Morse_code)
        // Kasuta sümboleid . ja -
        Map<String, String> morseCodes = new HashMap<>();
        morseCodes.put("s", "...");
        morseCodes.put("o", "---");
        morseCodes.put("i", "..");
        morseCodes.put("m", "--");

        String result = "";
        for(int i = 0; i < text.length(); i++){
            String character = text.substring(i, i+1);
            result += morseCodes.get(character) + " ";
        }
        return result;
    }
}
