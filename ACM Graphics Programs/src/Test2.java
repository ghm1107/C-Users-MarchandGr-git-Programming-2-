import javax.swing.*;

public class Test2 extends badGuy {

	public static void main(String[] args) {
		String a = "";

		a = JOptionPane.showInputDialog("Which weapon would you like? Choose either melee or projectile");

		if (a.equals("melee")) {
			System.out.println("BOOM, you were attacked by a melee weapon");
		} else if (a.equals("projectile")) {
			System.out.println("BANG, you were attacked by a projectile");
		} else {
			System.out.println("Input Error");
		}

		badGuy officer = new badGuy();
		officer.noise(a);
	}
}
