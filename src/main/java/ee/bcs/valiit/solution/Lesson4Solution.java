package ee.bcs.valiit.solution;

import java.util.HashMap;
import java.util.Scanner;

public class Lesson4Solution {
    // Store account nr as a key and account balance as value
    static HashMap<String, Double> accountBalanceMap = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("exit")){
                break;
            }
            // TODO 1
            // Add command: "createAccount ${accountNr}"
            // this has to store accountNr with 0 balance
            else if (line.equalsIgnoreCase("createAccount")) {
                System.out.println("Sisesta konto number");
                String accountNumber = scanner.nextLine();
                if(accountBalanceMap.get(accountNumber) != null){
                    System.out.println("Konto on juba olemas");
                    continue;
                }
                accountBalanceMap.put(accountNumber, 0.0);
            }
            // TODO 2
            // Add command: "getBalance ${accountNr}"
            // this has to display account balance of specific acount
            else if (line.equalsIgnoreCase("getBalance")){
                System.out.println("Sisesta konto nr");
                String accountNumber = scanner.nextLine();
                System.out.println(accountBalanceMap.get(accountNumber));
            }
            // TODO 3
            // Add command: "depositMoney ${accountNr} ${amount}
            // this has to add specified amount of money to account
            // You have to check that amount is positive number
            else if(line.equalsIgnoreCase("depositMoney")){
                System.out.println("Sisesta konto nr");
                String accountNumber = scanner.nextLine();
                System.out.println("Sisesta summa mida juurde liita");
                Double addedAmount = scanner.nextDouble();
                scanner.nextLine();
                if(addedAmount < 0){
                    System.out.println("Arv ei ole positiivne");
                    continue;
                }
                if(accountBalanceMap.get(accountNumber) == null){
                    System.out.println("Kontot ei ole");
                    continue;
                }
                Double newAmount = accountBalanceMap.get(accountNumber) + addedAmount;
                accountBalanceMap.put(accountNumber, newAmount);
            }
            // TODO 4
            // Add command: "withdrawMoney ${accountNr} ${amount}
            // This has to remove specified amount of money from account
            // You have to check that amount is positive number
            // You may not allow this transaction if account balance would become negative
            else if(line.equalsIgnoreCase("withdrawMoney")){
                System.out.println("Sisesta konto nr");
                String accountNumber = scanner.nextLine();
                System.out.println("Sisesta summa mida juurde liita");
                Double addedAmount = scanner.nextDouble();
                scanner.nextLine();
                if(addedAmount < 0){
                    System.out.println("Arv ei ole positiivne");
                    continue;
                }
                Double newAmount = accountBalanceMap.get(accountNumber) - addedAmount;
                if(newAmount < 0){
                    System.out.println("Kontol pole piisavalt raha");
                    continue;
                }
                accountBalanceMap.put(accountNumber, newAmount);
            }
            // TODO 5
            // Add command: "transfer ${fromAccount} ${toAccount} ${amount}
            // This has to remove specified amount from fromAccount and add it to toAccount
            // Your application needs to check that toAccount and fromAccount exists
            // And from account has enough money to do that transaction
            else if(line.equalsIgnoreCase("transfer")){
                System.out.println("Sisesta konto nr millelt teha ülekanne");
                String fromAccount = scanner.nextLine();
                System.out.println("Sisesta konto nr millele raha kanda");
                String toAccount = scanner.nextLine();
                System.out.println("Sisesta summa mida juurde liita");
                Double addedAmount = scanner.nextDouble();
                scanner.nextLine();
                if(addedAmount < 0){
                    System.out.println("Arv ei ole positiivne");
                    continue;
                }
                Double newFromAmount = accountBalanceMap.get(fromAccount) - addedAmount;
                Double newToAmount = accountBalanceMap.get(toAccount) + addedAmount;
                if(newFromAmount < 0){
                    System.out.println("Kontol pole piisavalt raha");
                    continue;
                }
                accountBalanceMap.put(fromAccount, newFromAmount);
                accountBalanceMap.put(toAccount, newToAmount);
            }
            else {
                System.out.println("Unknown command");
            }
        }
    }
}
