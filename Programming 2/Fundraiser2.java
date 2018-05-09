import javax.swing.*;

public class Fundraiser2 {

	public static void main(String args[]) {
		while (true) {

			String[] name = { "Leo", "Gwendolyn", "Lola", "Max", "Ruby", "Charlie", "Marv" };

			double[] donation = { 1.10, 1.53, 2.10, 1.75, 6.00, 3.21, 0.95 };

			String input = JOptionPane.showInputDialog("Who's donation would you like to see? Enter 0-6:");

			int x = Integer.parseInt(input);

			JOptionPane.showMessageDialog(null, name[x] + " donated $" + donation[x]);
		}
	}
}
