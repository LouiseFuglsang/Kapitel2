package Opgaver;

import java.util.Scanner;

public class Opgave7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter minuts ");

        //minuts
        int m = input.nextInt();

        //years in minuts
        int y = m / (60 * 24 * 365);

        //remaining minuts
        int rest_m = m % (60 * 24 * 365);

        //remaining days
        int rest_d = rest_m / (60 * 24);

        if (m < 0)
            System.out.println("Minutantallet skal være et positivt tal");
         else
            System.out.println(m + " minuts is " + y + " years and " + rest_d + " days");
    }
}
