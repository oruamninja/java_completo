package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;


public class Main {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.println("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter account holder: ");
        String name = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n) ");
        char option = sc.next().charAt(0);

        double inicial = 0.00;
        if (option == 'y') {
            System.out.println("Enter initial deposit value: ");
            inicial = sc.nextDouble();

            account = new Account(number, name, inicial);

        } else {

            account = new Account(number, name);

        };

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();

        System.out.println("Enter a deposit value: ");
        account.deposit(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();

        System.out.println("Enter a withdraw value: ");
        account.withdraw(sc.nextDouble());

        System.out.println("Updated account data: ");
        System.out.println(account);

        sc.close();

    }

}