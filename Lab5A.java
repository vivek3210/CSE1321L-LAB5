/*
Class: CSE 1321L
Section: WH1
Term: Fall 2022
Instructor: Nick Murphy
Name: Vivek Darji
Lab#: 5A
*/
import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {
        String drivingPermit;
        String commercialLicense;
        Scanner input = new Scanner(System.in);

        System.out.print("Do you have a driving permit (Y/N)? ");
        drivingPermit = input.next();
        if (drivingPermit.equals("n") || drivingPermit.equals("N"))
        {
            System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
        }
        if (drivingPermit.equals("y") || drivingPermit.equals("Y"))
            {
                System.out.print("Do you have a commercial driving license (Y/N)? ");
                commercialLicense = input.next();
                if (commercialLicense.equals("n") || commercialLicense.equals("N"))
                {
                    System.out.print("Commercial driving license is a prerequisite to purchase a vehicle!");
                }
                if (commercialLicense.equals("y") || commercialLicense.equals("Y"))
                {
                    System.out.print("Congratulations! You can purchase a vehicle, let's start talking options!");
                }
            }
        }
    }

