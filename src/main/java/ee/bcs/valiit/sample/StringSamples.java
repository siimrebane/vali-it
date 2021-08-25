package ee.bcs.valiit.sample;

public class StringSamples {
    public static void main(String[] args) {
        String a = "Hello World";
        for(int i = 0; i < a.length(); i++){
            System.out.println(a.substring(i, i+1));
        }

        for(int i = 0; i < a.length(); i++){
            System.out.println(a.charAt(i));
        }

        char[] array = a.toCharArray();
        for(int i = array.length -1; i>= 0; i--){
            System.out.println(array[i]);
        }
    }
}
