package Opgaver;

import java.util.Scanner;

public class Opgave9 {
    public static void main(String[] args) {

        // avarage acceleration: a = (v1 - v0) / t

        /* prompt user to enter:
        - starting velocity v0 in meters/seconds
        - ending velocity v1 in meters/seconds
        - time span t in seconds
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter v0, v1 and t: ");

        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();

        // display the avarage acceleration
        double a = (v1 - v0) / t;
        System.out.println("The avarage acceleration is " + a);


    }}
