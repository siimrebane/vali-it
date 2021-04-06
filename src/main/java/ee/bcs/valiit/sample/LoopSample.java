package ee.bcs.valiit.sample;

public class LoopSample {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 2, 7, 9, 3, 7, 4, 76, 2, 65, 7, 745};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        // ....
        int x = 0;
        while (x < array.length) {
            if(x == 4){
                break;
            }
            System.out.println("while väärtus: " + array[x] + " index: " + x);
            x++;
        }

        for (int i = 0; i < array.length; i++) {
            if(i%2 == 0){
                continue;
            }
            System.out.println("for väärtus: " + array[i] + " index: " + i);
        }

        for (int value : array) {
            System.out.println("for each väärtus: " + value);
        }
    }
}
