public class Overloaded_methods {
    public static void main(String[] args) {
        //overloaded methods = methods that share same name but have    different parameters
        //                     method name + parameters = method signature


        int z = add(1, 5, 8, 0);
        System.out.println(z);

    }

    static int add(int x, int y){
        return x + y;
    }

    static int add(int p, int q, int r){
        return p + q + r;

    }

    static int add(int p, int q, int r, int s){
        return p + q + r + s;
        
    }
}
