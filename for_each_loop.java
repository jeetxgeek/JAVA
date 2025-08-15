import java.util.ArrayList;

public class for_each_loop {
    public static void main(String[] args) {
        //for_each_loop  =  traversing technique to iterate through the elements in the array/collection
        //                  less steps,more readable
        //                  less flexible

        String[] animals = {"cat", "dog", "rat", "bird"};

        ArrayList<String> animal = new ArrayList<>();

        animal.add("cats");
        animal.add("dogs");
        animal.add("rats");
        animal.add("birds");

        for (String i : animals) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
        for (String i : animal) {
            System.out.println(i);
        }
    }
}
