/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask02;
import javax.swing.JOptionPane;

/**
 *
 * @author Demira Harry ST10443785 ST10443785@vcconnect.edu.za
 */
public class Process
        
{
     public static String wageString,dependents;
    public static void Dialogs()
    {
   
    //Variables 
    wageString = JOptionPane.showInputDialog(null, "Enter emplyee's hourly wage: ",
               "Salary dialog 1", JOptionPane.INFORMATION_MESSAGE);
            
    dependents = JOptionPane.showInputDialog(null, "How many dependents? : ",
               "Salary dialog 2",JOptionPane.QUESTION_MESSAGE);
           
    Calculations.GetNumber();
            
    JOptionPane.showMessageDialog(null, "Weekly salary is $" + Calculations.weeklyPay
               + "\nDeductions will be made for " +
               dependents + " dependents");
     
    }
}
//...........................................................................//