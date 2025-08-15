import java.util.Scanner;

public class Nested_loop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int rows;
        int column;
        String symbol = "";

        System.out.println("enter number of rows: ");
        rows = scan.nextInt();
        System.out.println("enter no of columns: ");
        column = scan.nextInt();
        System.out.println("enter the symbol to use: ");
        symbol = scan.next();


        for (int i = 0; i <=rows; i++) {
            System.out.println();
            for (int j = 0; j < column; j++) {
                System.out.print(symbol + " ");
                
            }
        }

    }
}
