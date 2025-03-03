//*******************************************************
// Triangle.java
// Checking whether three numbers form the length of a triangle
//*******************************************************
import java.util.Scanner;
public class Triangle
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in); // Create Reader
        System.out.println("This program Checking whether three numbers form the length of a triangle.");
        System.out.print("Enter  three numbers"); // Ask for input
        int x = scan.nextInt(); // Read value from user
        int y = scan.nextInt();
        int z = scan.nextInt();
        
        // Checking the correctnees of the input
        if( x <= 0 || y <= 0 || z <= 0)
        {
            System.out.println("The numbers: " + x + ", " + y + " and " + z + " cannot represent a triangle");
        }
        // checking if the numbers form triangle
        else if (x + y > z && x + z > y && y + z > x)
        {
            // checking if the triangle is Equilateral triangle 
            if (x==y && x==z)
            {
                System.out.print("The numbers: " + x + ", " + y + " and " + z + " represent an equilateral triangle");
            }
            // Checking if the triangle is isosceles triangle
            else if((x==y) || (x==z) || (y==z))
            {
                System.out.print("The numbers: " + x + ", " + y + " and " + z + " represent an isosceles triangle");
            }
            // Checking if the triangle is right-angle triangle
            else if ( (x*x + y*y == z*z) || (y*y + z*z == x*x) || (x*x + z*z == y*y))
            {
                System.out.print("The numbers: " + x + ", " + y + " and " + z + " represent an right-angle triangle");
            }
            else
            {
                System.out.print("The numbers: " + x + ", " + y + " and " + z + " represent an common triangle");
            }
        }
        else
        {
            System.out.print("The numbers: " + x + ", " + y + " and " + z + " cannot represent a triangle");
        }
    }// end of method main
}// end of class Triangle
