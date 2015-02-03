import javax.swing.JOptionPane;
public class plugIn
{
   public static void main(String[] args)
   {
      String input=null;
      double num2plug=0;
      double f;
      boolean entered_wrong = true;
      while(entered_wrong){
      input = JOptionPane.showInputDialog(null, "Enter a number to plug into the equation:  ");
      try
      {
         num2plug = Double.parseDouble(input);
         entered_wrong = false;
      }
      catch(Exception e){JOptionPane.showMessageDialog(null, "I'm sorry, that is not a number");}
      }
      
      f = 2*num2plug + 7;
      JOptionPane.showMessageDialog(null, "when you plug "+num2plug + " into the equation f(x) = 2x + 7 you get f(x) = "+ f);
   }

}