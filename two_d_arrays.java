public class two_d_arrays {
    public static void main(String[] args) {
        //2D Array

        //String[][] cars = new String[3][3];
        String[][] cars = {{"camero", "corvette", "silverado"},
                           {"Mustang", "ranger", "f-150"},
                            {"ferrari", "lambo", "tesla"}
                          };

        //above can also be written as below but the matrix will be printed according to flow of execution ie from top to bottom
        //Assigning values to 2D array
       /* 
        cars[0][0] = "camero";
        cars[0][1] = "corvetto";
        cars[0][2] = "mercede";
        cars[1][0] = "ferrari";
        cars[1][1] = "porche";
        cars[1][2] = "bentley";
        cars[2][0] = "mustang";
        cars[2][1] = "silverado";
        cars[2][2] = "Audi";
        */

        //displaying elements of 2D array
        for (int i = 0; i < cars.length; i++)//cars.length = 3 => i <3;
        {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) //cars[0].length = 3 => j <3;
            {
                System.out.print( cars[i][j] + " " );
            }
            
        }

    }
}
