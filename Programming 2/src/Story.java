import javax.swing.JOptionPane;

public class Story {
	
	String input = "";
	
	public void startAdventure() {
		System.out.println(" ");
		input = JOptionPane.showInputDialog("What is your name?");
		System.out.println("Hello " + input + ", welcome to the Cave of Mysteries!");
		System.out.println("You had just been hiking with your friends in the mountains for your birthday, but somehow you must have taken a wrong turn ");
		System.out.println("and have been separated from them. You look around and shout for your friends, but to no avail.");
		System.out.println("After walking for a while, you stumble across a mysterious cave and see footprints and think that");
		System.out.println("your friends must have gone inside to explore. You take a look at the dark cave and decide to go inside.");
	}
 
	public void insideCave(){
		System.out.println(" ");
		System.out.println("You have just entered the cave and once your eyes get adjusted to the darkness, you can make out two tunnels.");
		System.out.println("One is going off towards the left and the other, to the right. Which way do you decide to go?");
	}

	public void goLeft(){
		System.out.println(" ");
		System.out.println("You have decided to go left and see one of your friends' backpacks. Do you pick it up or leave it there?");
		
	}

	public void goRight(){
		System.out.println(" ");
		System.out.println("You decide to go right and see a big stick on the ground in front of you. Do you pick it up or leave it there?");
		
	}

	public void pickUpBackpack(){
		System.out.println(" ");
		System.out.println("You decide to pick up the backpack. It's a little heavy, but you don't really mind.");
		System.out.println("You go back to the front of the cave and decide to go right.");
	}
	
	public void leaveBackpack(){
		System.out.println(" ");
		System.out.println("You decide to leave the backpack there, thinking that it shouldn't be too useful in finding your friends anyways.");
		System.out.println("You go back to the front of the cave and decide to go right.");
	}
	
	public void pickUpStick(){
		System.out.println(" ");
		System.out.println("You decide to pick up the stick, thinking it will protect you, just in case there are any bears in the cave");
		System.out.println("You then continue onwards through the cave");
	}
	
	public void leaveStick(){
		System.out.println(" ");
		System.out.println("You decide to leave the stick where it is, thinking that there probably won't be anything in the cave that you can't handle yourself.");
		System.out.println("You then continue onwards through the cave.");
	}

	public void bearAttack(){
		System.out.println(" ");
		System.out.println("You have continued to journey deeper into the cave, when you suddenly hear a low growling sound. You see a large shadow in front of you,");
		System.out.println("but can't quite make out what it is. Suddenly the shadow becomes clear, and it's a large bear, but before you scream, terror takes the sound");
		System.out.println("before you make it. You're paralyzed and your out of time... The bear takes one swipe and the last thing you see is your lifless head falling to the ground.");
	}
	
	public void death(){
		System.out.println(" ");
		System.out.println("OH NO! You've been killed by the ferocious bear from the Cave of Mysteries! Try again to see if you can find your friends!");
		
	}

	public void bearFight(){
		System.out.println(" ");
		System.out.println("You have continued to journey deeper into the cave, when you suddenly hear a low growling sound. You see a large shadow in front of you,");
		System.out.println("but can't quite make out what it is. Suddenly the shadow becomes clear, and it's a large bear. Luckily you have that large stick you found earlier");
		System.out.println("to defend yourself with. Just as the bear is about to to take a swipe at you, you hit its head with your stick. The bear suddenly falls to the ground,");
		System.out.println("leaving you safe to continue your journey.");
	}

	
	public void reunion1(){
		System.out.println(" ");
		System.out.println("You're a bit tired after facing the evil bear, but continue through the cave. You begin to see a bit of light at the end of the tunnel");
		System.out.println("and can start to make out your friends in the distance. You begin to run towards them and they greet you with smiles, asking where you've been. ");
		System.out.println("One of your friends, Joe, then asks if you found your birthday present. You look at him curiously and he points to the backpack you're carrying.");	
		System.out.println("You open up the backpack and find all of your favorite candy inside. You hug al of your friends and wonder what other adventures your birthday will bring.");
	}
	
	public void winGame(){
		System.out.println(" ");
		System.out.println("Congrats, you have successfully made it through the Cave of Mysteries and have been reunited with your friends! Enjoy the rest of your birthday!");
		
	}
	
	public void reunion2(){
		System.out.println(" ");
		System.out.println("You're a bit tired after facing the evil bear, but continue through the cave. You begin to see a bit of light at the end of the tunnel");
		System.out.println("and can start to make out your friends in the distance. You begin to run towards them and they greet you with smiles, asking where you've been. ");
		System.out.println("One of your friends, Joe, then asks if you found your birthday present. You look at him curiously and he asks if you ever found a backpack.");	
		System.out.println("Now you look even more confused, your friends look worried, and it seems like you've forgotten something...");
	}
	
	public void restart(){
		System.out.println(" ");
		System.out.println("Oh no! It looks like you've forgotten something very important in the cave... Try again to see if you can find out what you've forgotten!");
		
	}
}
