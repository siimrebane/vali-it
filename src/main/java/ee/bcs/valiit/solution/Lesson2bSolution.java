package ee.bcs.valiit.solution;

import java.util.Arrays;

public class Lesson2bSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decreasingArray(-8)));
    }

    // TODO trüki välja n arvu
    // näiteks
    // sisend: 5
    // trüki välja: 1 2 3 4 5
    public static void exercise1(int n) {
        // fori näidis
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        // while näidis
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

    }

    // TODO tagasta massiiv milles oleks numbrid 1,2,3,4,5
    public static int[] sampleArray() {
        // variant 1
        //return new int[]{1, 2, 3, 4, 5};

        // variant 2
        //int[] x = {1, 2, 3, 4, 5};
        //return x;


        // variant 3
//        int[] x = new int[5];
//        x[0] = 1;
//        x[1] = 2;
//        x[2] = 3;
//        x[3] = 4;
//        x[4] = 5;
//        return x;

        // variant 4
//        int[] x = new int[5];
//        for(int i = 0; i < 5; i++){
//            x[i] = i+1;
//        }
//        return x;

        // variant 4
        int[] x = new int[5];
        for (int i = 1; i <= 5; i++) {
            x[i - 1] = i;
        }
        return x;
    }

    // TODO loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    // Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // näiteks:
    // sisend: 5
    // vastus: {1, 2, 3, 4, 5}
    public static int[] generateArray(int n) {
        int[] resultArray = new int[n];
        for (int i = 0; i < n; i++) {
            resultArray[i] = i + 1;
        }
        return resultArray;
    }

    // TODO
    // Tagastada massiiv kus oleks numbrid n-ist 0 ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: siend: -3
    // Väljund: -3, -2, -1, 0
    public static int[] decreasingArray2(int väärtus) {
        int[] array = new int[Math.abs(väärtus) + 1];
        int index = 0;

        while(väärtus != 0){
            array[index] = väärtus;
            if(väärtus > 0){
                väärtus = väärtus - 1;
            } else {
                väärtus = väärtus + 1;
            }
            index++;
        }
        return array;
    }

    public static int[] decreasingArray(int n) {
        if(n >= 0){
            int[] resultArray = new int[n+1];
            int index = 0;
            for(int i = n; i >= 0; i--){
                resultArray[index] = i;
                index++;
            }
            return resultArray;
        } else {
            int maxIndex = -n;
            int[] resultArray = new int[maxIndex + 1];
            for(int i = 0; i >= maxIndex; i++){
                resultArray[i] = n + i;
            }
            return resultArray;
        }
    }

    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] resultArray = new int[n];
        for(int i = 0; i < n; i++){
            resultArray[i] = 3;
        }
        return resultArray;
    }
}
