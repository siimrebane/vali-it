package ee.bcs.valiit.solution;

import java.util.Random;
import java.util.Scanner;

public class Lesson3HardSolution {

    // TODO kirjuta mäng mis leiab suvalise numbri 0-99, mille kasutaja peab ära arvama
    // iga kord pärast kasutaja sisestatud täis arvu peab programm ütlema kas number oli suurem või väiksem
    // ja kasutaja peab saama uuesti arvata
    // numbri ära aramise korral peab programm välja trükkima mitu katset läks numbri ära arvamiseks
    public static void main(String[] args){
        Random random = new Random();
        int i = random.nextInt(100);
        System.out.println(i);

        // TODO 1 tehke lõputu while tsükkel
        // TODO 2 tsükli sees küsige scanneri abil kasutaja käes 1 täisarv (int)
        // TODO 2.5 Trüki välja täis arv (vaata, et töötab)
        // TODO 3. Kas sisestatud arv oli õige või suurem/väiksem? Trüki välja
        // TODO 4. Kui arv oli õige. Lõpeta while tsükkel (break lause või täienda while tingimust)
        // TODO 5. Loo uus muutuja näiteks int count = 0, enne while tsüklit
        // TODO 6 iga kord kui tsükkel tööle läheb suurenda counti 1 võrra
        // TODO 7 juhul kui tsükkel saab läbi (kasutaja arvas numbri ära) Trüki count välja
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true) {
            count++;
            System.out.println("Arva number");
            int a = scanner.nextInt();
            if(a > i){
                System.out.println("Number oli liiga suur");
            } else if(a < i){
                System.out.println("Number oli liiga väike");
            } else {
                System.out.println("Õige");
                System.out.println("Kokku läka " + count + " korda");
                break;
            }
        }
    }
}
