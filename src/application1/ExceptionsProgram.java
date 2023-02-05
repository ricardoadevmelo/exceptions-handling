package application1;

import entities1.Account;
import exceptions.AccountExceptions;

import java.util.Locale;
import java.util.Scanner;

public class ExceptionsProgram {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        double balance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        } catch (AccountExceptions exceptions) {
            System.out.println(exceptions.getMessage());
        }

        scanner.close();
    }
}