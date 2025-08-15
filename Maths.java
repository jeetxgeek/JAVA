import java.math.*;
import java.util.*;

public class Maths {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter value of base: ");
        double base = scan.nextInt();
        System.out.println();
        
        System.out.println("Enter the value of perpedicular");

        
        double perpedicular = scan.nextInt();
        System.out.println();

        double z = base*base + perpedicular*perpedicular;
        double Hypotenuse = Math.sqrt(z);

        System.out.println("The hypotenuse for the given right triangle is : " + Hypotenuse);

        double  round = Math.round(5.34);
        System.out.println(round);

        double  ceil = Math.ceil(5.34);
        System.out.println(round);
        
        double  floor = Math.floor(5.34);
        System.out.println(round);
        

    }
}
