package ee.bcs.valiit.solution;

public class Lesson2Solution {

    public static void main(String[] args) {
        multiplyTable(5, 5);
    }

    // TODO loe funktsiooni sisendiks on täisarvude massiiv
    // TODO tagasta massiiv mille elemendid on vastupidises järiekorras
    public static int[] reverseArray(int[] inputArray) {
        int[] returnArray = new int[inputArray.length];

        for (int i = inputArray.length - 1; i >= 0; i--) {
            returnArray[i] = inputArray[inputArray.length - i - 1];
        }

        return returnArray;
    }

    // TODO tagasta massiiv mis sisaldab n esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    public static int[] evenNumbers(int n) {
        int[] returnArray = new int[n];
//        for(int i = 0; i < n; i++){
//            returnArray[i] = (i+1)*2;
//        }
        int index = 0;
        int number = 2;
        while (index < n) {
            returnArray[index] = number;
            index++;
            number = number + 2;
        }

        return returnArray;
    }

    // TODO, leia massiivi kõige väiksem element
    public static int min(int[] array) { // 4 2 6 1 9
        int minElement = array[0]; // minElement = 4
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minElement) {
                minElement = array[i];
            }
        }
        return minElement;
    }

    // TODO, leia massiivi kõige suurem element
    public static int max(int[] x) {
        int maxElement = x[0]; // minElement = 4
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maxElement) {
                maxElement = x[i];
            }
        }
        return maxElement;
    }

    // TODO, leia massiivi kõigi elementide summa
    public static int sum(int[] x) {
        int sum = 0;
        for (int i : x) {
            sum += i;
        }
        return sum;
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
    public static void multiplyTable(int x, int y) {
        for (int i = 1; i <= y; i++) {
            for (int j = 1; j <= x; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        int yleEelmne = 0; // n = 0
        int eelmine = 1; // n = 1
        for (int i = 2; i <= n; i++) {
            int sum = yleEelmne + eelmine;
            yleEelmne = eelmine;
            eelmine = sum;
        }
        return eelmine;
    }

    // TODO
    // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    // Tagasta fibonacci jada n element. Võid eeldada, et n >= 0
    public static int fibonacci2(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci2(n - 1) + fibonacci2(n - 2);
        }
    }
    // 0 1 | 0 + 1 = 1
    // 1 1 | 1 + 1 = 2
    // 1 2 | 1 + 2 = 3
    // 2 3 | 2 + 3 = 5
    // 3 5 | 3 + 5 = 8
    // 5 8 | 5 + 8 = 13
    // 8 13| 8 + 13 = 21


    // TODO
    // https://onlinejudge.org/external/1/100.pdf
    // Kujutame ette numbrite jada, kus juhul kui number on paaris arv siis me jagame selle 2-ga
    // Kui number on paaritu arv siis me korrutame selle 3-ga ja liidame 1. (3n+1)
    // Seda tegevust teeme me niikaua kuni me saame vastuseks 1
    // Näiteks kui sisend arv on 22, siis kogu jada oleks:
    // 22 -> 11 -> 34 -> 17 -> 52 -> 26 -> 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
    // Sellise jada pikkus on 16
    // Kirjutada programm, mis peab leidma kõige pikema jada pikkuse mis jääb kahe täis arvu vahele
    // Näiteks:
    // Sisend 10 20
    // Siis tuleb vaadata, kui pikk jada tuleb kui esimene numbr on 10. Järgmisen tuleb arvutada number 11 jada pikkus.
    // jne. kuni numbrini 20
    // Tagastada tuleb kõige pikem number
    // Näiteks sisendi 10 ja 20 puhul on vastus 20

    public static int sequence3n(int x, int y) {
        int max = 0;
        for (int i = x; i <= y; i++) {
            int count = 1;
            int value = i;
            while (value > 1) {
                if (value % 2 == 0) {
                    value = value / 2;
                } else {
                    value = value * 3 + 1;
                }
                count++;
            }
            if (count > max) {
                max = count;
            }
        }
        return max;
    }


}
