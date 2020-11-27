import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestMain {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 11, 25);
        LocalTime time = LocalTime.of(12, 59);
        LocalDateTime localDateTime = LocalDateTime.of(2020, 11, 25, 10, 57);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, time);
        localDateTime.toLocalDate();
        localDateTime.toLocalTime();
        localDateTime.plusDays(3);
        localDateTime.minusSeconds(500);
        LocalDateTime.now();
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
