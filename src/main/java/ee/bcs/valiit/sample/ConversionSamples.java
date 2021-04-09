package ee.bcs.valiit.sample;

public class ConversionSamples {
    public static void main(String[] args) {
        String question = "42";
        int answer = Integer.parseInt(question);
        System.out.println(answer);
        int a = 21;
        Integer b = 21;
        System.out.println(a + b);
        System.out.println(b.toString());
        System.out.println(""+a+b);
    }
}
