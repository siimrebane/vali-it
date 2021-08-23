package ee.bcs.valiit.sample;

public class LoopSample {
    public static void main(String[] args) {
        int[] array = {2, 5, 7};
        int i = 0;
        while (i < array.length) {
            System.out.println(array[i]);
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
        for (int i1 : array) {
            System.out.println(i1);
        }
    }
}
