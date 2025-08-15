public class arrays {
    public static void main(String[] args) {
        
        String[] car = {"camero","corvett","tesla","ferrari"};

        car[0] = "mustang"; //reassigning 
System.out.println();
        System.out.println(car[3]);
        System.out.println();
        System.out.println(car.length);

        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
            System.out.println();
        }
        System.out.println(car);



    }
}
