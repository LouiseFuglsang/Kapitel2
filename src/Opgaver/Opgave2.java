package Opgaver;

import java.util.Scanner;
import java.lang.Math;

public class Opgave2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of sides and the height of the Equilateral triangle: ");

        double height = input.nextDouble();
        double lengthOfSides = input.nextDouble();

    double area = (Math.sqrt(3) / 4) * (lengthOfSides) * (lengthOfSides);
    double volume = area * height;

    //BONUS: Thousand separator and two digits

        System.out.printf("The area is: %,.2f", area);
        System.out.println("");
        System.out.printf("The volume of the triangular prism is: %,.2f", volume);
   }
}
