package OOP;

public class abc {
    public static void main(String[] args) {
        
        car mycar = new car();
        car mycar1 = new car();

        System.out.println(mycar.model);
        System.out.println(mycar.make);
        System.out.println(mycar.price);
        
        System.out.println();

        mycar.drive();
        mycar.brake();

        System.out.println();

        System.out.println(mycar1.make);
        System.out.println(mycar1.model);
    }
}
