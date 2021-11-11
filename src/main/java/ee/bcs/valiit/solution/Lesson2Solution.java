package ee.bcs.valiit.solution;

import java.util.Arrays;

public class Lesson2Solution {
    public static void main(String[] args) {
        // TODO siia saab kirjutada koodi testimiseks
        System.out.println(Arrays.toString(decreasingArray(-5)));
    }

    // TODO loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    // Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // näiteks:
    // sisend: 5
    // vastus: {1, 2, 3, 4, 5}
    public static int[] generateArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }
        return result;
    }

    // TODO
    // Tagastada massiiv kus oleks numbrid n-ist 0 ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: siend: -3
    // Väljund: -3, -2, -1, 0
    public static int[] decreasingArray(int n) {
        int[] result = new int[Math.abs(n) + 1];
        for (int i = 0; i < result.length; i++) {
            if (n > 0) {
                result[i] = n - i;
            } else {
                result[i] = n + i;
            }
        }
        return result;
    }

    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = 3;
        }
        return array;
    }

    // TODO tagasta massiiv milles oleks numbrid 1,2,3,4,5
    public int[] sampleArray() {
//        return new int[]{1, 2, 3, 4, 5};'
        int[] result = new int[5];
        result[0] = 1;
        result[1] = 2;
        result[2] = 3;
        result[3] = 4;
        result[4] = 5;
        return result;
    }

}
