package ee.bcs.valiit.solution;

public class Lesson2bSolution {

    public static void main(String[] args) {
        System.out.println(fibonacci(0));
        System.out.println(fibonacci(1));
        System.out.println(fibonacci(2));
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(6));
    }

    // TODO loe funktsiooni sisendiks on täisarvude massiiv
    // TODO tagasta massiiv mille elemendid on vastupidises järiekorras
    public static int[] reverseArray(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = inputArray[resultArray.length - 1 - i];
        }
        return resultArray;
    }

    // TODO tagasta massiiv mis sisaldab n esimest paaris arvu
    // Näide:
    // Sisend 5
    // Väljund 2 4 6 8 10
    public static int[] evenNumbers(int n) {
        int[] resultArray = new int[n];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = (i + 1) * 2;
        }
        return resultArray;
    }

    // TODO, leia massiivi kõige väiksem element
    public static int min(int[] x) {
        int min = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < min) {
                min = x[i];
            }
        }
        return min;
    }

    // TODO, leia massiivi kõige suurem element
    public static int max(int[] x) {
        int max = x[0];
        for (int i : x) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // TODO, leia massiivi kõigi elementide summa
    public static int sum(int[] x) {
        int sum = 0;
        for (int i : x) {
            sum += i; // sum = sum + i
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
        for (int j = 1; j <= y; j++) {
            for (int i = 1; i <= x; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

    // TODO
    // Fibonacci jada on fib(n) = fib(n-1) + fib(n-2);
    // 0, 1, 1, 2, 3, 5, 8, 13, 21
    // Tagasta fibonacci jada n element. Võid eeldada, et n >= 0
    public static int fibonacci(int n) {
        int previous2 = 0;
        int previous = 1;
        if (n == 0) {
            return previous2;
        } else if (n == 1) {
            return previous;
        }
        for (int i = 1; i < n; i++) {
            int tmp = previous + previous2;
            previous2 = previous;
            previous = tmp;
        }
        return previous;
    }

    public static int fibonacciRec(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // TODO
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
        int maxLength = 0;
        for (int i = x; i < y; i++) {
            int length = 1;
            int count = i;
            while (count > 1) {
                if (count % 2 == 0) {
                    count = count / 2;
                } else {
                    count = count * 3 + 1;
                }
                length++;
            }
            if (length > maxLength) {
                maxLength = length;
            }
        }
        return maxLength;
    }

}
