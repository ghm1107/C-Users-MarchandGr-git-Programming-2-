import acm.program.*;
import acm.graphics.*;
import java.awt.*;
public class mouseClick extends GraphicsProgram{
	public void run(){
	
		while(true){
		
		GOval oval1 = new GOval (40, 40);
		oval1.setFilled(true);
		oval1.setColor(Color.BLUE);
		add(oval1, 70, 150);
		oval1.setVisible(true);
		waitForClick();
		oval1.setVisible(false);
		
		
		GOval oval2 = new GOval (40, 40);
		oval2.setFilled(true);
		oval2.setColor(Color.RED);
		add(oval2, 100, 250);
		waitForClick();
		oval2.setVisible(false);
	
	
		
		
		}
	
	}
}
