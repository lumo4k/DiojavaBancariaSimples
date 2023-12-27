package br.com.lumo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Agency:");

        String Ag = input.nextLine();

        System.out.println("Enter the Ag. Number:");

        int Number = Integer.parseInt(input.nextLine());

        System.out.println("Enter your name:");

        String Name = input.nextLine();

        System.out.println("Enter your account balance:");

        String AccountBalance = input.nextLine();
        double ParsedAccountBalance = Double.parseDouble(AccountBalance.replace(',', '.'));

        System.out.println("Your Agency is: " + Ag);
        System.out.println("Your Agency Number is: " + Number);
        System.out.println("Your Name is: " + Name);
        System.out.println("Your Account Balance is: " + ParsedAccountBalance);
    }
}
