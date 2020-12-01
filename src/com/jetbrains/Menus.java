package com.jetbrains;
import java.util.Scanner;

public class Menus extends FileServices {
    private static final Scanner kb = new Scanner(System.in);

    public int MainMenu() {
        System.out.println("\n+++++++    MAIN MENU    +++++++\t");
        System.out.println("\nPlease select and enter the number of one of these options: \t");
        System.out.println("Option 1: I am a Bank Employee\t");
        System.out.println("Option 2: I am a Customer\t");
        System.out.println("Option 3: Exit program\t");
        return kb.nextInt();
    }

    public int EmployeeMenu() {
        System.out.println("---------- Employees´ Options: ------------");
        System.out.println("\n1. Create new customer \t");
        System.out.println("2. Delete customer ");
        System.out.println("3. Manage transactions of the customer ");
        System.out.println("4. Generate customer lists ");
        System.out.println("5. Create new account");
        System.out.println("6. Delete new account");
        System.out.println("7. Return to the general menu");
        System.out.println("8. Quit ");
        return kb.nextInt();
    }

    public int CustomerMenu() {
        System.out.println("---------- Customers´ Transactions: ------------");
        System.out.println("\n1. See current account \t"); //ReadAccount-FileService
        System.out.println("2. Savings in the account ");
        System.out.println("3. Loans in the account ");
        System.out.println("4. Return to the general menu");
        System.out.println("5. Quit ");
        return kb.nextInt();
    }

}
