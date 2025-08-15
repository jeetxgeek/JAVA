package cons;

public class constructor1 {
    
    public static void main(String[] args) {
        
        humans human1 = new humans("rick", 56, 66);

 
        System.out.println("name: "+human1.name);

        humans human2 = new humans("morty", 40, 69);

        human2.eat();
        human2.drink();
    }
}
