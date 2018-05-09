import acm.graphics.*;
import acm.program.GraphicsProgram;
import acm.util.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

public class patapat extends GraphicsProgram{

	public void init(){
		addKeyListeners();
	}
	public void keyPressed(KeyEvent k)// note this is a self-contained method
	{
		Random rand = new Random();

		int redValue = rand.nextInt(255);
		int greenValue = rand.nextInt(255);
		int blueValue = rand.nextInt(255);

		Color clr = new Color(redValue, greenValue, blueValue);

		int key = k.getKeyCode();

		if (key == KeyEvent.VK_SPACE) {

			setBackground(clr);
		}


	}
	
}

