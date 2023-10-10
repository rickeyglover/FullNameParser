package com.pluralsight;

import java.util.Scanner;
public class FullNameParser {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Do you have a middle name? (yes/no): ");
        String choice = myScanner.nextLine();
        if (choice.equalsIgnoreCase("yes")){
            System.out.println("Enter your Full Name");
            System.out.println("First Name: ");
            String fname = myScanner.nextLine();
            fname = fname.trim();

            System.out.println("Middle Name: ");
            String mname = myScanner.nextLine();
            mname = mname.trim();


            System.out.println("Last Name: ");
            String lname = myScanner.nextLine();
            lname = lname.trim();

            System.out.println("First name: " + fname);
            System.out.println("Middle name: " + mname);
            System.out.println("Last name: " + lname);


        }
        else if (choice.equalsIgnoreCase("no")){
            System.out.println("Enter your Full Name");
            System.out.println("First Name: ");
            String fname = myScanner.nextLine();
            fname = fname.trim();

            System.out.println("Last Name: ");
            String lname = myScanner.nextLine();
            lname = lname.trim();

            System.out.println("First Name: " + fname);
            System.out.println("Last Name: " + lname);
        }

    }
}
