package Opgaver;

import java.util.Scanner;
public class Opgave5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Skriv subtotalen og procentsatsen for drikkepenge: ");

        double subtotal = input.nextDouble();
        double procentsats = input.nextDouble();

        double total = subtotal + subtotal * procentsats/100;
        double gratuity = subtotal * procentsats / 100;

        System.out.println("Drikkepengene bliver " + gratuity + "% " + "og den samlede total bliver " + total + "$");
    }
}
