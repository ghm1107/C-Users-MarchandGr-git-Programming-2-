import javax.swing.JOptionPane;

public class Fundraiser {

	public static void main(String args[]) {
		while (true) {

			String[] name = { "Leo", "Gwendolyn", "Lola", "Max", "Ruby", "Charlie", "Marv" };

			double[] donation = { 1.10, 1.53, 2.10, 1.75, 6.00, 3.21, 0.95 };

			JOptionPane.showMessageDialog(null, "Welcome to the fundraiser program!");


			JOptionPane.showMessageDialog(null, name[5] + " donated $" + donation[5]);
		}
	}
}
