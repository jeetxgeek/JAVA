package OOP;

// Class define kar rahe hain
class Student {
    // Instance variables jo student ka naam aur age store karenge
    String name; // Student ka naam
    int age;     // Student ki umar

    // Constructor: Object ko initialize karne ke liye use hota hai
    Student(String studentName, int studentAge) {
        name = studentName; // Parameter ka value 'name' variable mein store kar rahe hain
        age = studentAge;   // Parameter ka value 'age' variable mein store kar rahe hain
    }

    // Method jo student ke details ko print karega
    void displayDetails() {
        System.out.println("Name: " + name); // Student ka naam print karenge
        System.out.println("Age: " + age);   // Student ki umar print karenge
    }
}

// Yaha se program ka execution start hoga
public class constructors2 {
    // Main method: Program ka starting point
    public static void main(String[] args) {
        // Student class ka pehla object banaya aur initialize kiya
        Student s1 = new Student("Amit", 20); // "Amit" aur 20 constructor ko pass kiya
        s1.displayDetails(); // Pehle student ka naam aur age print karenge

        // Student class ka doosra object banaya aur initialize kiya
        Student s2 = new Student("Priya", 22); // "Priya" aur 22 constructor ko pass kiya
        s2.displayDetails(); // Doosre student ka naam aur age print karenge
    }
}
