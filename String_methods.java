public class String_methods {
    public static void main(String[] args) {
        
        String name = "jeetesh";

        String sname = new String("kushawaha");

        System.out.println(name+" "+sname);

        // equal method
        boolean result = name.equalsIgnoreCase("jeetesh");

        String cars = "buggati"; // Initialize the variable

        // Compare 'cars' with "buggati"
        boolean carResult = cars.equals("buggati");

        System.out.println(carResult); // Print the comparison result of 'cars'

        System.out.println(result); // Print the result of 'name.equalsIgnoreCase("jeetesh")'

        //Length method
        System.out.println(name.length());

        //charat method
        char cresult = name.charAt(5);
        System.out.println(cresult);

        //indexof method
        int iresult = name.indexOf("e");
        System.out.println(iresult);

        //isEmpty
        boolean sresult = name.isEmpty();
        System.out.println(sresult);

        //toUpperCase() method
        String tresult = name.toUpperCase();
        System.out.println(tresult);

        //toLowerCase() method
        String lresult = name.toLowerCase();
        System.out.println(lresult);

        //trim() method (remove empty spaces from string)
        String mresult = name.trim();
        System.out.println(mresult);

        //replace() method
        String rresult = name.replace( 'e', 'o');
        System.out.println(rresult);
    }
}
