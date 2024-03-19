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
public class Calculations
{
    public static double wage_value,weeklyPay;
    public static int number; 
    public static  final double HOURS_IN_WEEK = 40;
     
    public static void GetNumber()
    {
        
    weeklyPay=Double.parseDouble(Process.wageString)*HOURS_IN_WEEK;
    number=Integer.parseInt(Process.dependents);
     
    }
    
}
//...........................................................................//