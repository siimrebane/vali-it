package ee.bcs.valiit.tasks;

public class ExcrptionTest {
    public static void main(String[] args) {
        test(1);
    }

    private static void test(int i){
        if(i % 100 == 0){
            System.out.println(i);
        }
        test(i+1);
    }


}
