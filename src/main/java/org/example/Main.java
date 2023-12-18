package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){

        System.out.println("Wellcome to my little calculator. Do what you want ;)");

        Scanner reader = new Scanner (System.in);

        while(true) {

            System.out.println("enter the command. You may use +, - and quit! ");

            String command = reader.nextLine();

            if (command.equals("quit")) {

                break;
            }
            System.out.println("enter the numbers:");
            int a = Integer.parseInt(reader.nextLine());
            int b = Integer.parseInt(reader.nextLine());

            if (command.equals("+")) {
                System.out.println("Result is: " + (a+b));
            }
            else if (command.equals("-")) {
                System.out.println("Result is: " + (a-b));
            }
            else {
                System.out.println("unknown command :/");
            }





        }
        System.out.println("thank you bye, bye ;)");
    }
}