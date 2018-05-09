import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Ball extends GCompound {

	GOval ball;
	double dirX = 10;
	double dirY = 10;
	double x, y, px, px2;

	

	public Ball() {
		ball = new GOval(30, 30);
		ball.setColor(Color.YELLOW);
		ball.setFilled(true);
		add(ball, 150, 150);

	}

	public void testForCollision(Blocks blocks){
		
		x = ball.getX();
		y = ball.getY();
		dirY = blocks.getRowLocation(x, y, dirY);
		ball.move(dirX, dirY);
		
	}
	public int bounce(Paddle paddle, int lives) {//receives object as parameter
		ball.move(dirX, dirY);
		x = ball.getX();
		y = ball.getY();
		px = paddle.getX();
		px2 = px + 150;
	
	
		
		if (y > 430 && y <= 480){
			
			if(x >= px && x <= px2){
				dirY= -dirY;
			}
		}

		if (x >= 1000) {
			dirX = -dirX;
		}

		if (x <= 0) {
			dirX = -dirX;
		}

		if (y >= 500) {
			lives = lives - 1;
			dirY = -dirY;
			
		}

		if (y <= 0) {
			dirY = -dirY;
		}
	
	return lives;
	
	
	}

}
