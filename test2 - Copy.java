class StaticExample {
    // Static variable
    static int count = 0; // Sab objects ke liye ek hi copy

    // Constructor
    StaticExample() {
        count++; // Jab bhi object banega, count badhega
    }

    // Static method
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

public class test2 {
    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample(); // count = 1
        StaticExample obj2 = new StaticExample(); // count = 2

        // Static method ko directly class ke naam se call kar sakte hain
        StaticExample.displayCount(); // Output: Total objects created: 2
    }
}
