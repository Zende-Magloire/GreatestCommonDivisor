import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int A=0, B=0;

        // TODO: greet the user
        System.out.println("Hi! This program computes the greatest common divisor of two numbers.");
        System.out.println();

        // TODO: read first integer (repeat until positive)
        int a = 0;
                do
                {
                    System.out.print("Please enter the first positive number: ");
                    a = Integer.valueOf(reader.nextLine());
                }
                while(a<=0);

        // TODO: read second integer (repeat until positive)
        int b = 0;
                do
                {
                    System.out.print("Please enter the second positive number: ");
                    b = Integer.valueOf(reader.nextLine());
                }
                while(b<=0);
        // TODO: compute GCD
        do
        {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        while(b!=0);

        // TODO: print out answer

        System.out.println("\nThe GDC is: " + a);


    }


    }

