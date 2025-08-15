import java.util.Scanner;

import javax.swing.JOptionPane;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter your age: ");
        int age = scan.nextInt();
        // If the 'if' statement evaluates to true, the other conditionals will be skipped.

        if (age == 18) {
            JOptionPane.showMessageDialog(null, "You are an adult!");
        } 
        else if (age >= 50) {
            JOptionPane.showMessageDialog(null, "OK BOOMER!");
        } 
        else {
            JOptionPane.showMessageDialog(null, "You are not an adult!");
        }
    }
}
