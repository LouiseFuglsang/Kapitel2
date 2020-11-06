package Opgaver;

import java.util.Scanner;

public class Opgave4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number in square meters: ");
        int squareMeter = input.nextInt();

        double ping = squareMeter * 0.3025;

        System.out.println("" + squareMeter + " square meter is " + ping + " ping.");
    }
}

