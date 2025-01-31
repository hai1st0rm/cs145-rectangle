// maya wrote this file, modified a few things to plug it into the Rectangle class -Owen
package lab2;
/*
 * RectangleTest.java
 * Description:
 * Takes user input and sends to manager class for Rectangle.
 * 
 * Date: 1-24-25
 * Ref: Liang et al.
 */

import java.util.Scanner;

public class RectangleTest
{
    public static void main(String[] args)
    {
        Scanner inScanner = new Scanner(System.in);
        Scanner strScanner;
        int x1;
        int y1;
        int x2;
        int y2;
        // added more points as req'd
        int x3;
        int y3;
        int x4;
        int y4;
        String point1;
        String point2;
        String point3;
        String point4;
        System.out.println("Please enter some coordinates for a rectangle");

        System.out.print("first point (x1,y1) > ");
        point1 = inScanner.nextLine();
        System.out.print("second point (x2,y2) > ");
        point2 = inScanner.nextLine();
        //added more prompts for extra points, idk why the cursor is not inline for these :/
        System.out.println("third point (x3,y3) > ");
        point3 = inScanner.nextLine();
        System.out.println("fourth point (x4,y4) > ");
        point4 = inScanner.nextLine();

        System.out.println("reading input...");

        point1 = point1.replace("(", "");
        point1 = point1.replace(")", "");
        point1 = point1.replace(",", " ");

        point2 = point2.replace("(", "");
        point2 = point2.replace(")", "");
        point2 = point2.replace(",", " ");

        point3 = point3.replace("(", "");
        point3 = point3.replace(")", "");
        point3 = point3.replace(",", " ");

        point4 = point4.replace("(", "");
        point4 = point4.replace(")", "");
        point4 = point4.replace(",", " ");

        strScanner = new Scanner(point1);

        x1 = strScanner.nextInt();
        y1 = strScanner.nextInt();

        strScanner.close();


        strScanner = new Scanner(point2);

        x2 = strScanner.nextInt();
        y2 = strScanner.nextInt();

        strScanner.close();

        strScanner = new Scanner(point3);

        x3 = strScanner.nextInt();
        y3 = strScanner.nextInt();

        strScanner.close();

        strScanner = new Scanner(point4);

        x4 = strScanner.nextInt();
        y4 = strScanner.nextInt();

        strScanner.close();

        // this is just testing stuff, remove it before submitting
        System.out.printf("coordinates entered: (%d,%d), (%d,%d), (%d,%d), (%d,%d)%n", x1, y1, x2, y2, x3, y3, x4, y4);

        inScanner.close();

    }
}