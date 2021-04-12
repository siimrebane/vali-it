package ee.bcs.valiit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String a = "Hello World";
        System.out.println(a.length());
        System.out.println(a.charAt(6));
        System.out.println(a.substring(0,5));
        String b = "Hello World";
        if(a.equals(b)){
            System.out.println("Õige");
        }
        if(a == b){
            System.out.println("Vale");
        }
    }


}
