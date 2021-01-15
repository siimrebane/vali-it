package ee.bcs.valiit.tasks.solution;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Scanner;

public class Lesson4 {
    // Store account nr as a key and account balance as value
    static HashMap<String, BigDecimal> accountBalanceMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Please eneter command: ");
            String command = scanner.nextLine();
            String[] commandParts = command.split(" "); // createAccount EE123x
            if (command.equalsIgnoreCase("exit")){
                break;
            } else if(commandParts[0].equalsIgnoreCase("createAccount")){
                accountBalanceMap.put(commandParts[1], new BigDecimal("0"));
            }
            // TODO 2
            // Add command: "getBalance ${accountNr}"
            // this has to display account balance of specific acount
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
