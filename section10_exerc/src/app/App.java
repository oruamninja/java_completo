package app;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("How many rooms will be rented ? ");
        int rents = sc.nextInt();
        sc.nextLine();

        for(int i=1; i<=rents; i++) {
            System.out.println();
            System.out.println("Rent #"+i);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int bedroom = sc.nextInt();

            vect[bedroom] = new Rent(name, email, bedroom);
        }

        System.out.println();
        System.out.println("Busy rooms:");
        for (int i=0; i<vect.length; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i].getBedroom() + ": " + vect[i].getName() + ", " + vect[i].getEmail());
            }
        }

        sc.close();
    }
}