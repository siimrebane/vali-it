package ee.bcs.valiit.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lesson4Solution {
    // Store account nr as a key and account balance as value
    private static Map<String, Double> accountBalanceMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("Insert command");
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")){
                break;
            } else if(line.equalsIgnoreCase("createAccount")){
                // TODO 1
                // Add command: "createAccount ${accountNr}"
                // this has to store accountNr with 0 balance
                System.out.println("Please enter account nr");
                String accountNr = scanner.nextLine();
                System.out.println("Please enter inital balance");
                Double balance = scanner.nextDouble();
                scanner.nextLine();
                accountBalanceMap.put(accountNr, balance);
            } else if(line.equalsIgnoreCase("getBalance")){
                // TODO 2
                // Add command: "getBalance ${accountNr}"
                // this has to display account balance of specific acount
                System.out.println("Please enter account nr");
                String accountNr = scanner.nextLine();
                System.out.println("Konto balanss on: " + accountBalanceMap.get(accountNr));
            }
            // TODO 3
            // Add command: "depositMoney ${accountNr} ${amount}
            // this has to add specified amount of money to account
            // You have to check that amount is positive number
            // TODO 4
            // Add command: "withdrawMoney ${accountNr} ${amount}
            // This has to remove specified amount of money from account
            // You have to check that amount is positive number
            // You may not allow this transaction if account balance would become negative
            // TODO 5
            // Add command: "transfer ${fromAccount} ${toAccount} ${amount}
            // This has to remove specified amount from fromAccount and add it to toAccount
            // Your application needs to check that toAccount is positive
            // And from account has enough money to do that transaction
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
