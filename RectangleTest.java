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
        String point1;
        String point2;
        System.out.println("Please enter some coordinates for a rectangle");

        System.out.print("first point (x1,y1) > ");
        point1 = inScanner.nextLine();
        System.out.print("second point (x2,y2) > ");
        point2 = inScanner.nextLine();

        System.out.println("reading input...");

        point1 = point1.replace("(", "");
        point1 = point1.replace(")", "");
        point1 = point1.replace(",", " ");

        point2 = point2.replace("(", "");
        point2 = point2.replace(")", "");
        point2 = point2.replace(",", " ");

        strScanner = new Scanner(point1);

        x1 = strScanner.nextInt();
        y1 = strScanner.nextInt();

        strScanner.close();


        strScanner = new Scanner(point2);

        x2 = strScanner.nextInt();
        y2 = strScanner.nextInt();

        strScanner.close();
        // this is just testing stuff, remove it before submitting
        System.out.printf("coordinates entered: (%d,%d), (%d,%d)%n", x1, y1, x2, y2);

        inScanner.close();

    }
}