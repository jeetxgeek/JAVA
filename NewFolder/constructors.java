package OOP;

class Student {
    String name;
    int age;

    // Constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class constructors {
    public static void main(String[] args) {
        // Object creation
        Student s1 = new Student("Amit", 20); // Constructor automatically call hoga
        s1.displayDetails();

        Student s2 = new Student("Priya", 22);
        s2.displayDetails();
    }
}
