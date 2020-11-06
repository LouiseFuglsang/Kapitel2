package Opgaver;

import java.util.Scanner;
public class Opgave6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Skriv et tal mellem 0 og 1000: ");

        int heltal = input.nextInt();

        int a = heltal / 100;
        int b = (heltal / 10) % 10;
        int c = heltal % 10;

        if ( a == 0) a = 1 ;
        if ( b == 0) b = 1 ;

        int Total = a * b *c;

        if ( heltal > 999 || heltal < 1)
            System.out.println("Tallet skal være mellem 1 og 1000");
        else
            System.out.println("De indtastede tal multipliceret giver " + Total);
        }
    }

