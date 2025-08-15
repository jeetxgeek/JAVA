public class SWAP_Program {

    public static void main(String[] args) {
        String x = "water";
        String y = "kool-aid";
        String temp;
        System.out.println();
        System.out.println("value before swapping:");
        System.out.println( "x: "+x);
        System.out.println("y: " +y);
        System.out.println();
        System.out.println();

        temp = x;
        x=y;
        y = temp;

        System.out.println("value after swapping:");
        System.out.println("x: " +x);
        System.out.println("y: " +y);

        System.out.println();

    }
}