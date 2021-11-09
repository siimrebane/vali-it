package ee.bcs.valiit.solution;

public class Lesson0Solution {
    public static void main(String[] args) {
        excersie1();
        excersie2();
        excersie3();
    }

    // TODO
    //  defineeri 3 muutujat a = 1, b = 1, c = 3
    //  Prindi välja a==b
    //  Prindi välja a==c
    //  Lisa rida a = c
    //  Prindi välja a==b
    //  Prindi välja a==c, mis muutus???
    public static void excersie1() {
        int a = 1;
        int b = 1;
        int c = 3;
        System.out.println(a == b);
        System.out.println(a == c);
        a = c;
        System.out.println(a == b);
        System.out.println(a == c);
    }

    // TODO
    //  Loo muutujad x1 = 10 ja x2 = 20, vali sobiv andmetüüp
    //  Tekita muutuja y1 = ++x1, trüki välja nii x1 kui y1
    //  Tekita muutuja y2 = x2++, trüki välja nii x2 ja y2
    //  Analüüsi tulemusi
    public static void excersie2() {
        int x1 = 10;
        int x2 = 20;
        int y1 = ++x1;
        int y2 = x2++;
        System.out.println(x1 + " " + y1);
        System.out.println(x2 + " " + y2);
    }

    // TODO
    //  Loo arvulised muutujad
    //  a = 18 % 3
    //  b = 19 % 3
    //  c = 20 % 3
    //  d = 21 % 3
    //  Prindi välja kõigi muutujate väärtused
    public static void excersie3() {
        int a = 18 % 3;
        int b = 19 % 3;
        int c = 20 % 3;
        int d = 21 % 3;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // Ilma, et te koodi kirjutate vastake küsimustele. Kui palju on
        System.out.println(2%3);
        System.out.println(15%3);
        System.out.println(4%2);
        System.out.println(16%15);
    }

}
