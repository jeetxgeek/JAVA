public class methods {
    public static void main(String[] args) {
        //method = a block of code that is executed whenever it is called upon

        String name = "jeetesh";
        hello(name);

        int x = 7;
        int y = 6;

        add(x,y);

    }

     static void hello(String j){
        System.out.println("Hello "+ j +" this is hello method");
    }

    static int add(int p, int q){
        int z = p+q;
        System.out.println(z);
        return z;
    }
}
