/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 5C
*/
import java.util.Scanner;
public class Lab5C {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        x = input.nextInt();
        System.out.print("Enter y: ");
        y = input.nextInt();

        if (x == 0 && y == 0)
        {
            System.out.println("This point is the origin.");
        }
        else if ( x == 0)
        {
            System.out.println("This point is on the y axis.");
        }
        else if (y == 0)
        {
            System.out.println("This point is on the x axis.");
        }
        else if (x > 0 && y > 0)
        {
            System.out.println("This point is in the first quadrant.");
        }
        else if (x < 0 && y > 0)
        {
            System.out.println("This point is in the second quadrant.");
        }
        else if (x < 0 && y < 0)
        {
            System.out.println("This point is in the third quadrant.");
        }
        else if (x > 0 && y < 0)
        {
            System.out.println("This point is in the fourth quadrant.");
        }
    }
}
