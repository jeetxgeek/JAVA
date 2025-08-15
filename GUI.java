import javax.swing.JOptionPane;

public class GUI {
    public static void main(String[] args) {
        //print input screen name message
        String Message = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + Message);

        //input age GUI box
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age: "));     
        
        //Integer.parseInt() will convert string message to int as Joption takes the value as string
        JOptionPane.showMessageDialog(null, "You are " + age + " Old");

        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your Height:"));
        JOptionPane.showMessageDialog(null,"You are " + height + " cm tall");

        double weight =  Double.parseDouble(JOptionPane.showInputDialog("Enter your Weight:"));
        JOptionPane.showMessageDialog(null,"You are " +` weight + "kg");

        JOptionPane.showMessageDialog(null, "Thank You " + Message + "!! 😊");




    }
}
