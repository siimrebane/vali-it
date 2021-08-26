package ee.bcs.valiit.sample;

public class RecursionVsLoopSample {
    public static void main(String[] args) {
        for(int i = 1; i < 1000000; i++){
            if(i%10000==0){
                System.out.println(i);
            }
        }
        test(1);
    }

    private static void test(int n) {
        if(n%10000==0){
            System.out.println(n);
        }
        if(n < 1000000){
            test(n + 1);
        }
    }

}
