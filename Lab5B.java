/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 5B
*/
import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        int num;
        int modulus2 = 2;
        int modulus3 = 3;
        int modulus5 = 5;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        num = input.nextInt();

        if (num % modulus2 == 0)
        {
            System.out.println("This number is divisible by 2");
        }
        else if (num % modulus3 == 0)
        {
            System.out.println("This number is divisible by 3");
        }
        else if (num % modulus5 == 0)
        {
            System.out.println("This number is divisible by 5");
        }
        else {
            System.out.println("This number is undetermined");
        }
    }
}
