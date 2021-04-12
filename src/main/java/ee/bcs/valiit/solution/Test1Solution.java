package ee.bcs.valiit.solution;

import java.util.Arrays;

public class Test1Solution {
    public static void main(String[] args) {
        System.out.println(divides(3));
        System.out.println(divides(7));
        System.out.println(divides(21));
        System.out.println(divides(4));
        System.out.println(Arrays.toString(addToArray(new int[]{4, 7, 1, 9}, 3)));
    }
//    ÜL 1
//    Tee funktsioon, mis tagastab boolean väärtuse ja võtab sisse ühe parameetri
//    funktsioon peab tagastama
//		true: kui sisend parameeter jagub 3 või 7 (aga ei jagu mõlema numbriga)
//            false: kui sisend parameeter ei jagu 3 ega 7 või jagub mõlema numbriga

    public static boolean divides(int a){
        if(a % 3 == 0 && a % 7 != 0){
            return true;
        } else if (a % 7 == 0 && a % 3 != 0) {
            return true;
        } else {
            return false;
        }
    }

    // ÜL2
    // lisa x igale array elemendile
    // Näiteks
    // sisend [1,2,3], 5
    // vastus [6,7,8]
    public static int[] addToArray(int[] array, int x){
        for(int i = 0; i < array.length; i++){
            array[i] = array[i] + x;
        }
        return array;
    }

}
