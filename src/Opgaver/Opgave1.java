package Opgaver;

import java.util.Scanner;

public class Opgave1 {
    public static void main(String[] args) {

        //Scanner object
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles you want to convert to kilometers: ");
        //Prompter user for input
        int miles = input.nextInt();

        double km = 1.6 * miles;

        System.out.println(miles + " miles is " + km + " kilometers.");
    }
}
