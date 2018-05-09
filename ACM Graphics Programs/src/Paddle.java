import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Paddle extends GCompound {

	public Paddle() {
		GRect paddle = new GRect(150, 10);
		paddle.setColor(Color.BLUE);
		paddle.setFilled(true);
		add(paddle, 0, 0);
	}

	public void moveLeft() {
		move(-30, 0);
	}

	public void moveRight() {
		move(30, 0);
	}

}


