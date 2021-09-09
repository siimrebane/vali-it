package ee.bcs.valiit.sample;

public class TryCatchSample {
    public static void main(String[] args) {
        try {
            test();
            throw new RuntimeException("text");
        } catch (Exception e) {
            System.out.println("juhtus viga");
        }
    }

    private static void test() throws Exception {
        System.out.println("test algab");
        test1();
        System.out.println("test lõppeb");
    }

    private static void test1() throws Exception {
        System.out.println("test 1 algab");
        test2();
        System.out.println("test1 lõppeb");
    }

    private static void test2() throws Exception {
        System.out.println("test2 algab");
        throw new Exception("katki");
    }

}











