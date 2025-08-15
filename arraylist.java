import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        
        //Arraylist = resizeable array
        //              Elements can be added and removed after compilation phase
        //

        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("burger");
        food.add("french fries");
        food.add("Coke");

        //replace element
        food.set(0, "paneer");
        //remove element
        food.remove(2);
        //clear list
        food.clear();
        //clone list

        for (int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
    }
}
