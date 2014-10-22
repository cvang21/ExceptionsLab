package lab2;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        int[] a = {1,2,3};
        String fullName = JOptionPane.showInputDialog("Enter full name:");        
        String lastName = "";
        try {
          lastName = nameService.extractLastName(fullName, a);
        } catch (IllegalArgumentException iae){
            System.out.println(iae.getMessage () + "Caused by:" + iae.getCause());
            return;
        }
          
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
