import javax.swing.*;

public class introToArrays {
	public static void main(String args[]) {
		while (true) {
			String[] bands = { "Coldplay", "One Republic", "The Script", "Maroon 5" };
			String input = JOptionPane.showInputDialog("Which position or band would you like to see? Enter 0-5:");
			int x = Integer.parseInt(input);
			JOptionPane.showInputDialog("The band is " + bands[x]);
		}
	}
}
