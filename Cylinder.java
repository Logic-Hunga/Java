/** java Scanner*/
import java.util.*;
import java.util.Date;

/**main class */
public class Cylinder {

    /**main method */
    public static void main (String[] args) {

        /**main method body */
        Scanner input = new Scanner (System.in);

        // prompt the user to enter the radius snd the height of the cylinder
        System.out.print("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.print("Enter the height: ");
        double height = input.nextDouble();
    

        /**Return methods invocation */
        System.out.printf("The area of cylinder is %f and\nThe volume is %f", area(radius), volume(radius, height));
    }
    // Defining the return method for area and the volume
    public static double area(double radius) {
        return Math.PI *Math.pow(radius, 2);
    }
    
    public static double volume(double radius, double height) {
        return area(radius) * height;
        
    }
}











































































































































































