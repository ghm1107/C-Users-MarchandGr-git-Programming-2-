import acm.graphics.*;
import acm.program.GraphicsProgram;
import javax.swing.JOptionPane;
import java.awt.*;
import acm.util.*;

public class magic8ball extends GraphicsProgram {

	GLabel output = new GLabel("8"); // creates label object
	GLabel output2 = new GLabel("");
	GLabel output3 = new GLabel("Welcome to the world's best Magic 8 Ball!");
	GLabel output4 = new GLabel("Think of a yes/no question, deeply focus on the ball, and click on the 8 to reveal your answer!");
	GOval ball1 = new GOval(500, 500); // Creates oval with specified size
	GOval ball2 = new GOval(250, 250);
	GOval ball3 = new GOval(250, 250);
	GOval ball4 = new GOval(250, 250);

	public void run() {

		output3.setFont("SansSerif-BOLD-50");
		output3.setColor(Color.BLACK);
		add(output3, 10, 50);

		output4.setFont("SansSerif-BOLD-25");
		output4.setColor(Color.BLACK);
		add(output4, 10, 90);

		ball4.setFilled(true);
		ball4.setColor(Color.WHITE);
		add(ball4, 725, 475);

		ball1.setFilled(true);
		ball1.setColor(Color.BLACK);
		add(ball1, 600, 350);

		ball2.setFilled(true);
		ball2.setColor(Color.WHITE);
		add(ball2, 725, 475);

		ball3.setFilled(true);
		ball3.setColor(Color.BLACK);
		add(ball3, 715, 475);

		ball4.setFilled(true);
		ball4.setColor(Color.WHITE);
		add(ball4, 725, 475);
		output.setFont("SansSerif-BOLD-150");
		output.setColor(Color.BLACK);
		add(output, 805, 650);
		ball4.setVisible(true);
		waitForClick();
		ball4.setVisible(false);

		RandomGenerator rgen = RandomGenerator.getInstance();

		int a = rgen.nextInt(0, 4);

		String[] answer = { "Unlikely", "Probable", "Highly probable", "Definite NO", "Definite YES" };

		output2.setLabel(answer[a]);
		output2.setFont("SansSerif-BOLD-25");
		output2.setColor(Color.BLUE);
		add(output2, 760, 600);
		output2.setVisible(true);
		waitForClick();
		output2.setVisible(false);

		System.exit(0);

	}

}

