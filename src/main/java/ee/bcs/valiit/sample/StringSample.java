package ee.bcs.valiit.sample;

public class StringSample {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String c = a + " " + b;
        System.out.println(c);
        System.out.println(c.length());
        System.out.println(a.concat(" ").concat(b));
        System.out.println(b.charAt(3));
        String x = "abc";
        String y = "Abc";
        if(x.equals(y)){
            System.out.println("x == y");
        }
        if(x.equalsIgnoreCase(y)){
            System.out.println("x == y (ignore case)");
        }
        if(x.startsWith("a")){
            System.out.println("Algab a märgiga");
        }
        printStuff();
    }

    public static void printStuff(){
        System.out.println("stuff");
    }

}
