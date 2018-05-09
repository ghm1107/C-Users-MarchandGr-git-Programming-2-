import javax.swing.*;
public class Calculator2 {
public static void main (String args[]){
		
		String a = "";
		String b = "";
		String c = " ";
		
		double aa,bb;
		
		
	secondFile2 z = new secondFile2();
		
	JOptionPane.showMessageDialog(null, "Hello! Welcome to the Crazy Calculator 2000!");
	a = JOptionPane.showInputDialog("Enter a number: ");
	b = JOptionPane.showInputDialog("Enter another number: ");
	c = JOptionPane.showInputDialog("Would you like to add, subtract, multiply, or divide these numbers?");
	
	aa = Integer.parseInt(a);
	bb = Integer.parseInt(b);
	
	z.printNumber(aa, bb, c);
		
	
	}
}
