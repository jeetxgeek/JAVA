public class String_and_methods {
    public static void main(String[] args) {
        
        System.out.println();

        //String
        String greeting = "hello world";
        System.out.println(greeting);
        System.out.println();

        //string methods
        //length
        int length = greeting.length();
        System.out.println(length);
        System.out.println();

        //concatenate
        String fname = "john ";
        String lname = "cena";
        String fullname = fname + lname;
        System.out.println(fullname);
        System.out.println();

        //substring
        String substring = greeting.substring(5,greeting.length());
        System.out.println(substring);
        System.out.println();

        //charAt & replace
        System.out.println(greeting.charAt(6));
        System.out.println();
        String nString = greeting.replace("hello", "hii"); 
        System.out.println(nString);
        System.out.println();

        //uppercase
        String nString2 = greeting.toUpperCase();
        System.out.println(nString2);
        System.out.println();


    }
}
