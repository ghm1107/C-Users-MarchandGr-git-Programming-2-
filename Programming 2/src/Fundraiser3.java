import javax.swing.JOptionPane;

public class Fundraiser3 {

	public static void main(String args[]) {
		while (true) {

			String[] name = { "Leo", "Gwendolyn", "Lola", "Max", "Ruby", "Charlie", "Marv" };

			double[] donation = { 1.10, 1.53, 2.10, 1.75, 6.00, 3.21, 0.95 };
			
			String input = JOptionPane.showInputDialog("Who's donation would you like to edit? Enter 0-6:");
			
			int x = Integer.parseInt(input);
			
			
		
			
			String input2 = JOptionPane.showInputDialog("How much money would you like to add to " +name[x]+ "'s donation?");
			
			int y = Integer.parseInt(input2);
			donation[x]=donation[x]+y;
			
			JOptionPane.showMessageDialog(null, "You have added " +y+ " to "+name[x]+ "'s original donation. Their total donation now is "+donation[x]);
		}
	}
}

