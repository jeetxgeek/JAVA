import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        // while loop  = executes a block of code as long as it's condition remains true

        Scanner scan = new Scanner(System.in);
        String name = "";

        while (name.isBlank()) {
            System.out.println("Enter your name: ");
            name = scan.nextLine();
        }
        System.out.println("hello " + name );
    }
}
