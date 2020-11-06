package Opgaver;

import java.util.Scanner;

public class Opgave3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value for meter: ");
            int meter = input.nextInt();

            double feet = meter * 3.2786;

        System.out.println("" + meter + " meter is " + feet + " feet.");
    }
}
