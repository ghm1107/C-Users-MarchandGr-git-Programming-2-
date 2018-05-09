
//Step 5 organize all imported libraries
import javax.swing.JOptionPane;

//Step 1 create a main method and class definition

public class overView {

	public static void main(String[] args) {
		// Step 2 declare all variable
		String input1, input2;// tells us the type of variable and names
		int x, y;

		// Step 3 initialize all variables with an initial value
		input1 = ""; // null or empty value
		input2 = "text from keyboard";
		x = 123;// these integer values are whole numbers
		y = 0;

		// Step 4 Get all inputs

		input1 = JOptionPane.showInputDialog("Enter your name");
		// whatever input is typed gets stored in input1


		//Step 8 while loop logic repetition
		 while(true){//"true means it's an endless loop"
		// Step 6 logic
		if (input1.equals("Sean")) {
			JOptionPane.showInputDialog("Congrats, you have entered the first if block of code!");
			break;//forces you out of a loop
		}
		// the above IF isn't associated with the ELSE below
		if (input1.equals("Grace")) {// IF statements use curly braces, NOT
										// semicolons
			JOptionPane.showInputDialog("Congrats, you have entered the first if block of code!");
			break;
		} // an ELSE needs to immediately follow an IF closing brace
		else // this is a default,doesn't need any conditions in the parenthesis
		{
			JOptionPane.showInputDialog("default, enter Grace or Sean!");
		}

		// Step 7 output..my fina1 output
		JOptionPane.showMessageDialog(null, "This is the end of the program!");
		 }
	}

}
