import javax.swing.*;

public class TextVideoGame {

	public static void main(String[] args){
		
		UserChoices choice = new UserChoices();
		Story story = new Story();
		
		story.startAdventure();
		story.insideCave();
		choice.askLeftOrRight();
	
		
	
		
		if(choice.getLeftOrRight().equalsIgnoreCase("left")){
			story.goLeft();
			choice.pickUpBackpack();
		if(choice.getpickUpBackpack().equalsIgnoreCase("pick up")){
			story.pickUpBackpack();
			story.goRight();
		}else{
			story.leaveBackpack();
			story.goRight();
		}
		
		}else{
			story.goRight();
		}
		
		choice.pickUpStick();
		
		if(choice.getpickUpStick().equalsIgnoreCase("pick up")){
			story.pickUpStick();
			story.bearFight();
		}else{
			story.leaveStick();
			story.bearAttack();
			story.death();
			System.exit(0);
			
		}
		
		
	
		
	
		if(choice.getpickUpBackpack().equalsIgnoreCase("pick up")){
			story.reunion1();
			story.winGame();
			System.exit(0);
			}else{
			story.reunion2();
			story.restart();
			System.exit(0);
			
		}
	
	}
	
	
	
}