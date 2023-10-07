import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        public static void main(String arg[])
        {
            try
            {
                Login frame=new Login();
                frame.setSize(300,100);
                frame.setVisible(true);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());}
        }
}