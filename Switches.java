public class Switches {
    public static void main(String[] args) {
        // Switches = statement that allows a variable to be tested for equality against a list of values it used where we have use if else conditionals many times
        int day = 4;
        switch (day) {
          case 1:
            System.out.println("Monday");
            break;
          case 2:
            System.out.println("Tuesday");
            break;
          case 3:
            System.out.println("Wednesday");
            break;
          case 4:
            System.out.println("Thursday");
            break;
          case 5:
            System.out.println("Friday");
            break;
          case 6:
            System.out.println("Saturday");
            break;
          case 7:
            System.out.println("Sunday");
            break;
        }
        // Outputs "Thursday" (day 4)
         
    }
}



//A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.

//The default keyword specifies some code to run if there is no case match

//Note that if the default statement is used as the last statement in a switch block, it does not need a break.