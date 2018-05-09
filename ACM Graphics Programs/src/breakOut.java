import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;

import javax.swing.JOptionPane;

import java.awt.*;

public class breakOut extends GraphicsProgram {
	
	
	String input = "";
	GLabel welcomeMessage;
	GLabel output;
	
	Paddle paddle;
	Ball ball;
	Blocks blocks;
	int lives;

	
	public void init(){
		
		setSize(1000, 500);
		welcomeMessage = new GLabel("Click To Start");
		welcomeMessage.setFont("SansSerif-BOLD-50");
		welcomeMessage.setColor(Color.WHITE);
		add(welcomeMessage, 300, 250);
		paddle = new Paddle();
		ball = new Ball();
		blocks = new Blocks();
		addKeyListeners();
		lives = 3;

	} 
	
	public void run(){
		
		setBackground(Color.BLACK);
		input = JOptionPane.showInputDialog("What is your name?");
		waitForClick();
		remove(welcomeMessage);
		output = new GLabel(input +"'s Lives: " + lives );
		output.setFont("SansSerif-BOLD-20");
		output.setColor(Color.WHITE);
		add(output, 5, 490);
		add(blocks);
		add(ball);
		add(paddle);
		
		while(true){//game loop
			
			if (paddle.getX() <= 0) {
				paddle.setLocation(0, 450);
			}
			
			if (paddle.getX() + 150 >= 1000) {
				paddle.setLocation(850, 450);
		}
			
			pause(100);
			lives = ball.bounce(paddle, lives); // sends object as parameter
			ball.testForCollision(blocks);
			
		
			output.setLabel(input + "'s Lives: " + lives);
			
		if(lives <= 0){
			System.exit(0);
		}
		
		}
		
		}
	
	
	public void keyPressed(KeyEvent k){
		int key = k.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT){
			paddle.moveLeft();
		}
		
		if(key == KeyEvent.VK_RIGHT){
			paddle.moveRight();
		}
	
		
	}
}
