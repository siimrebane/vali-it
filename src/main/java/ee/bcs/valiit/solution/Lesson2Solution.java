package ee.bcs.valiit.solution;

import ee.bcs.valiit.tasks.Lesson1;

import java.util.Arrays;

public class Lesson2Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decreasingArray(9)));
        // TODO siia saab kirjutada koodi testimiseks
    }

    // TODO loo massiiv mis saab sisendiks n ja tagastab massiivi suurusega n
    // Kus esimene element on 1 ja iga järnev arv on 1 võrra suurem
    // näiteks:
    // sisend: 5
    // vastus: {1, 2, 3, 4, 5}
    public static int[] generateArray(int n) {
        int[] array = new int[n]; // array pikkusega n
        for (int i = 0; i < n; i++) { // tee nii mitu korda kui pikk on array
            array[i] = i + 1; // väärtusta ühele elemendile õige number
        }
        return array;
    }

    // TODO
    // Tagastada massiiv kus oleks numbrid n-ist 0 ini
    // Näiteks: sisend: 5
    // Väljund: 5, 4, 3, 2, 1, 0
    // Näide2: siend: -3
    // Väljund: -3, -2, -1, 0
    public static int[] decreasingArray(int n) {
        int[] array = new int[Lesson1.abs(n) + 1];
        for (int i = 0; i < array.length; i++) {
            if (n > 0) {
                array[i] = n - i;
            } else {
                array[i] = n + i;
            }
        }
        return array;
    }

    // TODO
    // tagasta massiiv pikkusega n, mille kõigi elementide väärtused on 3
    public static int[] yl3(int n) {
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = 3;
        }
        return array;
    }

    // TODO tagasta massiiv milles oleks numbrid 1,2,3,4,5
    public int[] sampleArray() {
        int[] array = new int[5]; // array {0, 0, 0, 0, 0}
        array[0] = 1; // array {1, 0, 0, 0, 0}
        array[1] = 2; // array {1, 2, 0, 0, 0}
        array[2] = 3; // array {1, 2, 3, 0, 0}
        array[3] = 4; // array {1, 2, 3, 4, 0}
        array[4] = 5; // array {1, 2, 3, 4, 5}
        return array;
        // return new int[]{1,2,3,4,5};
    }
}
