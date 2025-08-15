import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter the string:");

        String par = myScanner.nextLine();
        int i; int n = par.length();
        for(i=0;i<n;i++)
        {
            char a = par.charAt(i);
            System.out.println(a + " ");
        }
    }
    
}
