//Owen Smith - Lab 2
// this is the "object" class of the program
package lab2;
public class Rectangle {
    public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        // constructor, making a rectangle object I think...
        setCoordinates(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    public void setCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        //TODO: hook this up to validate coordinents with helper method isValidCoordinates
    }
    private boolean isValidCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        boolean isQ1 = false;
        boolean correctSize = false;
        if((x1 > 0 & y1 > 0) & (x2 > 0 & y2 > 0) & (x3 > 0 & y3 > 0) & (x4 > 0 & y4 > 0)){
            // is in quadrent 1
            isQ1 = true;
        }
        if((x1 <= 20) & (y1 <= 20) & (x2 <= 20) & (y2 <= 20) & (x3 <= 20) & (y3 <= 20) & (x4 <= 20) & (y4 <= 20)){
            // isnt over 20
            correctSize = true;
        }
        if((correctSize = true) & (isQ1 = true)){
            return true;
        } else {
            return false;
        }
        
    }
//    private double[] getSidePairs(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
//        // return an array with the sides paird up
//        // calculate distances between consecutive points - not sure if they have to be consecutive clockwise but I'm not 100% sure on how to do this otherwise...
//        double side2 = getSideDist(x2, y2, x3, y3);
//        double side3 = getSideDist(x3, y3, x4, y4);
//        double side4 = getSideDist(x4, y4, x1, y1);
//
//        // return the 4 side lengths in order
//        //return new double[] {side1, side2, side3, side4};
//        //temp!
//        return new double[] {1.5, 2.5};
//    }

    private double getSideDist(double xa, double ya, double xb, double yb){
        // get the distance of a side
        // Use the distance formula: √[(x2-x1)^2 + (y2-y1)^2]  (deepseek helped me with this implimentation, didn't know about the power method before this -_-)
        return Math.sqrt(Math.pow(xb - xa, 2) + Math.pow(yb - ya, 2));
    }
    public double getLength(double side1, double side2, double side3, double side4){
        double largest = side1;  // assume side 1 is larger first?

        // Compare the sides to find the largest
        if (side2 > largest) largest = side2;
        if (side3 > largest) largest = side3;
        if (side4 > largest) largest = side4;

        return 1.5;
    }

    public double getWidth(){
        return 1.5;
    }
    public static void testMethod(){
        System.out.println("Hello World!");
    }
}