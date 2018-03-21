import javax.swing.JOptionPane;

public class UserChoices {

	String input2 = "";
	String input3 = "";
	String input4 = "";
	String input5 = "";
	
	public void askLeftOrRight() {
		
		input2 = JOptionPane.showInputDialog("Enter left or right");
		
		}
	
	public void pickUpBackpack(){
		input3 = JOptionPane.showInputDialog("Enter pick up or leave");
	}

	public void pickUpStick(){
		input4 = JOptionPane.showInputDialog("Enter pick up or leave");
	}
	public String getLeftOrRight(){
		return input2;
	}
	
	public String getpickUpBackpack(){
		return input3;
	}
	
	public String getpickUpStick(){
		return input4;
	}

	public String getleaveStick(){
		return input5;
	}
}
