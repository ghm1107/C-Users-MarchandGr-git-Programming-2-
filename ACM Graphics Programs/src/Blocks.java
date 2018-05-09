import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Blocks extends GCompound {

	GRect[] row1 = new GRect[12];
	GRect[] row2 = new GRect[12];
	int count = 0;
	int x = 20;
	double a, b;
	int blockCount = 0;

	GLabel winnerMessage;

	public Blocks() {

		winnerMessage = new GLabel("Congrats! You WON!");
		winnerMessage.setFont("SansSerif-BOLD-50");
		winnerMessage.setColor(Color.WHITE);

		for (count = 0; count < 12; count++) {
			row1[count] = new GRect(75, 20);
			row1[count].setColor(Color.RED);
			row1[count].setFilled(true);

			add(row1[count], x, 0);
			x = x + 80;
		}
	

	}

	public double getRowLocation(double x, double y, double dirY) {

		for (count = 0; count < 12; count++) {
			a = row1[count].getX();
			b = a + 75;

			if (y <= 20) {

				if (row1[count].isVisible()) {

					if (x >= a && x <= b) {
						(row1[count]).setVisible(false);
						remove(row1[count]);
						blockCount++;

						dirY = -dirY;
					}
				}

				if (blockCount >= 12) {

					add(winnerMessage, 250, 250);
				}
			}

		}
		return dirY;
	}

}
