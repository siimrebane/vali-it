package ee.bcs.valiit.solution;

import java.util.Arrays;

public class LessonASolution {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5};
        e15(a);
        System.out.println(Arrays.toString(a));
    }

    public static int e1(int a) {
        // tagasta vastasmärgiline arv
        return -a;
    }

    public static int e2(int a, int b) {
        // tagasta kahe arvu keskmine
        return (a + b) / 2;
    }

    public static int e3(int x) {
        // lahuta sisendist 5 ja siis korruta 99
        return (x - 5) * 99;
    }

    public static int e4(int a1, int b1, int a2, int b2, int a3, int b3) {
        // korruta a1 b1-ga, a2 b2-ga jne. Ning siis liida saadud numbrid
        return a1 * b1 + a2 * b2 + a3 * b3;
    }

    public static int e5() {
        // return the answer to the Life, the Universe, and Everything.
        return 42;
    }

    public static boolean e6(int x) {
        // Kas arv on liigaasta
        // Wikipeediast:
        // Iga aasta, mis jagub neljaga, on liigaasta (kui ta samal ajal ei jagu sajaga).
        // Kui aasta jagub sajaga ja ei jagu neljasajaga siis ta ei ole liigaasta. Aasta, mis jagub neljasajaga, on alati liigaasta.
        // See tähendab näiteks, et aastad 1984 ja 2000 olid liigaastad, 1900 aga mitte.
        if (x % 400 == 0) {
            return true;
        } else if (x % 100 == 0) {
            return false;
        } else if (x % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean e7(boolean x) {
        return !x;
    }

    public static boolean e8(boolean x1, boolean x2) {
        // tagasta true kui AINULT 1 sisend muutujatest on true
        if (x1 && x2) {
            return false;
        } else if (!x1 && !x2) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean e9(boolean x1, boolean x2, boolean x3, boolean x4) {
        int count = 0;
        if (x1) {
            count++;
        }
        if (x2) {
            count++;
        }
        if (x3) {
            count++;
        }
        if (x4) {
            count++;
        }
        return count % 2 == 1;
    }

    public static void e10(int x[]) {
        // muuda sisend massiivi nii et kõik elemendid oleksid 2x suuremad
        for (int i = 0; i < x.length; i++) {
            x[i] *= 2; // x[i] = x[i] * 2;
        }
    }

    public static void e11(int x[]) {
        // määra sisend massiivi teine element (index 1) 0-iks
        x[1] = 0;
    }

    public static void e12(int x[]) {
        // vaheta massiivi esimene ja teine element omavahel
        int initalX0 = x[0];
        x[0] = x[1];
        x[1] = initalX0;
    }

    public static void e13(int x[]) {
        // määra massiivi teise elemendi väärtuseks sama mis esimesel elemendil
        x[1] = x[0];
    }

    public static void e14(int x[]) {
        // määra massiivi teise elemendi väärtuseks sama mis esimesel elemendil
        x[1] = x[0];
        // määra massiivi neljanda elemendi väärtuseks sama mis kolmandal elemendil
        x[3] = x[2];
        // määra massiivi kuuenda elemendi väärtuseks sama mis viiendal elemendil
        x[5] = x[4];
        // määra massiivi kaheksanda elemendi väärtuseks sama mis seitsmendal elemendil
        x[7] = x[6];
    }

    public static void e15(int x[]) {
        // määra iga teine (indeksid 1, 3, jne) element massiivis samaks, mis oli talle eelnenud elemendi väärtus
        for (int i = 1; i < x.length; i = i + 2) {
            System.out.println("i=" + i);
            x[i] = x[i - 1];
        }
    }

}
