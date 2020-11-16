public class TestMain {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        System.out.println("test");
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}
