import pbox2d.PBox2D;
import processing.core.PApplet;

public class MyProcessingSketch extends PApplet {

	public void setup() {
		size(640, 480);
	}

	public void draw() {
		background(255);
		text("Hello Processing in Eclipse!!!", 50, 50);
	}

	public static void main(String args[]) {
		PApplet.main(new String[] { "--present", "MyProcessingSketch" });
	}
}
