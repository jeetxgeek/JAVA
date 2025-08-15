import java.util.ArrayList;

public class TwoD_arraylist {

    public static void main(String[] args) {
        //2D Arraylist = a dynamic list of lists
        // you can change the size of these lists during runtime

        ArrayList<ArrayList<String>> grocery = new ArrayList<>();

        ArrayList<String> bakerylist = new ArrayList<String>();
        bakerylist.add("pasta");
        bakerylist.add("garlic_breads");
        bakerylist.add("doughnuts");

        ArrayList<String> produce = new ArrayList<>();
        produce.add("tomatoes");
        produce.add("carrot");
        produce.add("potato");

        ArrayList<String> drink = new ArrayList<>();
        drink.add("Coke");
        drink.add("Sprite");
        

        grocery.add(bakerylist);
        grocery.add(produce);
        grocery.add(drink);
        
        System.out.println(bakerylist);
        
        System.out.println(grocery);

        System.out.println(grocery.get(0).get(1));





    }
}