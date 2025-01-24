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
        int x1;
        int y1;
        int x2;
        int y2;
        System.out.println("Please enter some coordinates for a rectangle");

        System.out.print("x1 > ");
        x1 = inScanner.nextInt();
        System.out.print("y1 > ");
        y1 = inScanner.nextInt();
        System.out.print("x2 > ");
        x2 = inScanner.nextInt();
        System.out.print("y2 > ");
        y2 = inScanner.nextInt();

        // this is just testing stuff, remove it before submitting
        System.out.printf("coordinates entered: (%d,%d), (%d,%d)%n", x1, y1, x2, y2);

        inScanner.close();

    }
}