import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner myn = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = myn.nextInt();
        int i;
        int fact = 1;
        if (n == 0) {
            System.out.println("number is 0 hence factorial = 1");
        }
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("the factorial of entered number is:" + fact);
    }

}
