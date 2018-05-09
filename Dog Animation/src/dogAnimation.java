import acm.graphics.*;
import acm.program.GraphicsProgram;
import java.awt.Color;

public class dogAnimation extends GraphicsProgram {
	
	animation anim; // declares a new object from the animation final

	public void run() {
	
		setSize(500,500);
		
		anim = new animation(); // Initializes the new object
		
		add(anim, 100, 100); // add the object to the screen
		
		waitForClick();
		
		while(true){
			anim.animateSprite();
			pause(300);
		}
		
	}

}


