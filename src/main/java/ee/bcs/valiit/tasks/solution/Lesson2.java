package ee.bcs.valiit.tasks.solution;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Lesson2 {

    public static void main(String[] args) {
        exercise1();
    }

    // TODO loo 10 elemendile täisarvude massiv
    // TODO loe sisse konsoolist 10 täisarvu
    // TODO trüki arvud välja vastupidises järiekorras
    public static void exercise1() {
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Sisesta number: ");
            array[i] = scanner.nextInt();
        }
        for(int i = 9; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }

    // TODO prindi välja x esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    public static void exercise2(int x) {
    }

    // TODO trüki välja korrutustabel mis on x ühikut lai ja y ühikut kõrge
    // TODO näiteks x = 3 y = 3
    // TODO väljund
    // 1 2 3
    // 2 4 6
    // 3 6 9
    // TODO 1 trüki korrutustabeli esimene rida (numbrid 1 - x)
    // TODO 2 lisa + " " print funktsiooni ja kasuta print mitte println
    // TODO 3 trüki seda sama rida y korda
    // TODO 4 Kuskile võiks kirjutada System.out.println(),
    //  et saada taebli kuju
    // TODO 5 võrdle ridu. Kas on mingi seaduspärasus ridade vahel,
    // mis on ja mis võiks olla. Äkki tuleb mõni idee
    public static void exercise3(int x, int y) {

    }

    // TODO
    // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    // Tagasta fibonacci jada n element
    public static int exercise4(int n) {

        return 0;
    }

    public static String exercise5(int x, int y) {
        // https://onlinejudge.org/index.php?option=onlinejudge&Itemid=8&page=show_problem&problem=36
        // TODO 1 (tee alamfunktsioon) mis leiab 3n+1 sequenci pikkuse
        // kui on paaris / 2 kui on paaritu *3+1
        // TODO 2 tee tsükkel mis leiab i -> j kõige suurema tsükkli pikkuse
        return "";
    }


}
