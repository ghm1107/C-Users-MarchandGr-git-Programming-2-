import javax.swing.JOptionPane;

public class Tires {

	public static void main(String args[]) {

		
		boolean T1Changed = false;
		boolean T2Changed = false;
		boolean T3Changed = false;
		boolean T4Changed = false;
		

		String input1 = "";
		String input2 = "";
		String input3 = "";
		String input4 = "";
	

		input1 = JOptionPane.showInputDialog("Has Tire 1 been changed, or is it being removed?");

		if (input1.equals("removed")) {
			JOptionPane.showMessageDialog(null, "RED, working on changing tire!");
		} else {
			JOptionPane.showMessageDialog(null, "RED, tire is changed, waiting on other tires.");
			T1Changed = true;
		}

		input2 = JOptionPane.showInputDialog("Has Tire 2 been changed, or is it being removed?");

		if (input2.equals("removed")) {
			JOptionPane.showMessageDialog(null, "RED, working on changing tire!");
		} else {
			JOptionPane.showMessageDialog(null, "RED, tire is changed, waiting on other tires.");
			T2Changed = true;
		}

		input3 = JOptionPane.showInputDialog("Has Tire 3 been changed, or is it being removed?");

		if (input3.equals("removed")) {
			JOptionPane.showMessageDialog(null, "RED, working on changing tire!");
		} else {
			JOptionPane.showMessageDialog(null, "RED, tire is changed, waiting on other tires.");
			T3Changed = true;
		}
		input4 = JOptionPane.showInputDialog("Has Tire 4 been changed, or is it being removed?");

		if (input4.equals("removed")) {
			JOptionPane.showMessageDialog(null, "RED, working on changing tire!");
		} else {
			JOptionPane.showMessageDialog(null, "RED, tire is changed, wait for GREEN to accelerate!");
			T4Changed = true;
		}

		if(T1Changed==true && T2Changed==true && T3Changed==true && T4Changed==true){
			JOptionPane.showMessageDialog(null, "GREEN, you are clear to accelerate");
		}
		else{
			JOptionPane.showMessageDialog(null, "RED, some tires are still being changed! You are NOT clear to accelerate!");
		}
		
	

	}

}
