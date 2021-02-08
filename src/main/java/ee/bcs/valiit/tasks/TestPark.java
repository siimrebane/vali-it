package ee.bcs.valiit.tasks;

import ee.bcs.valiit.tasks.solution.DemoApplicationException;

import java.util.Random;

public class TestPark {

    public static void main(String[] args) {
        try {
            System.out.println("alusta millegagi");
            controller();
            System.out.println("tee midagi");
        } catch (DemoApplicationException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Tee seda alati");
        }
        System.out.println("Programmi lõpp");

    }

    private static void controller() throws Exception {
        System.out.println("Test exception begin");
        service();
        System.out.println("Test exception end");
    }

    private static void service() throws Exception {
        System.out.println("Test exception2 begin");
        repository();
        System.out.println("Test exception2 end");
    }

    private static void repository() throws Exception {
        System.out.println("Test exception3 begin");
        Random random = new Random();
        if(random.nextBoolean()){
            throw new DemoApplicationException("Kontol ei ole piisavalt raha");
        }
        System.out.println("Test exception3 end");
    }

}
