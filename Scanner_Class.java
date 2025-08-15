import java.util.*;

public class Scanner_Class {
    public static void main(String[] args) {
        Scanner scan = new  Scanner(System.in);

        System.out.println("what is your name");
        String name = scan.nextLine();

        System.out.println("AGe: ");
        int AGe = scan.nextInt();
        scan.nextLine();

        System.out.println("favourite food;");
        String food = scan.nextLine();
        


        System.out.println("hello " + name);
        System.out.println("your age is: " + AGe);
        System.out.println("your favourite food: " + food);
       
        
        
        
    }
}
