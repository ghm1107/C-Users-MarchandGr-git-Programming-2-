import java.awt.Color;
import acm.graphics.GCompound;
import acm.graphics.GImage;

public class animation extends GCompound {

	GImage[] images = { new GImage("d1.PNG"), new GImage("d2.PNG"), new GImage("d3.PNG"), new GImage("d4.PNG"),
			new GImage("d5.PNG"), new GImage("d6.PNG"), new GImage("d7.PNG"), new GImage("d8.PNG"),
			new GImage("d9.PNG") };

	public void animateSprite() {

		images [0].setVisible(true);
		pause(50);
		images [0].setVisible(false);
		images [1].setVisible(true);
		pause(50);
		images [1].setVisible(false);
		images [2].setVisible(true);
		pause(50);
		images [2].setVisible(false);
		images [3].setVisible(true);
		pause(50);
		images [3].setVisible(false);
		images [4].setVisible(true);
		pause(50);
		images [4].setVisible(false);
		images [5].setVisible(true);
		pause(50);
		images [5].setVisible(false);
		images [6].setVisible(true);
		pause(50);
		images [6].setVisible(false);
		images [7].setVisible(true);
		pause(50);
		images [7].setVisible(false);
		images [8].setVisible(true);
		pause(50);
		images [8].setVisible(false);
		
		

	}

	public animation() {

		for (int i = 0; i < images.length; i++) {
			add(images[i], 0, 0);
			images[i].setSize(500, 500);
			images[i].setVisible(false);
		}

	}
}
