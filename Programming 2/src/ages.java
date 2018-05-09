import javax.swing.*;

public class ages {
	public static void main(String args[]) {
		String[] name = { "Riley", "Steve", "Sean", "Sophia", "Abbey", "Chris", "John" };
		String[] age = { "13", "18", "20", "25", "19", "17", "15" };
		String[] year = { "2005", "2000", "1998", "1993", "1999", "2001", "2003" };

		String input = JOptionPane.showInputDialog("Which friend would you like to know more about? Enter 0-6:");

		int x = Integer.parseInt(input);

		JOptionPane.showInputDialog(
				"My friend's name is " + name[x] + " they are " + age[x] + " years old. They were born in " + year[x]);

	}
}
