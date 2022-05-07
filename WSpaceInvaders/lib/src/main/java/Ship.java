import java.awt.Image;
import java.awt.geom.Rectangle2D;

import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;

public abstract class Ship extends Drawable {
	
	protected boolean hit = false;
	protected Image image;
	private Clip hitSound = getSound("aud_hit.wav");
	
	protected Rectangle2D shape;
	
	
	public Ship(int x, int y) {
		// set position using super (Drawable) method
		super(x, y);
		// instantiates rectangle object @ pos (x, y), size 10x10
		shape = new Rectangle2D.Double(x,y,10,10);
	
	}
	
	// method to determine if a ship has been hit 
	public boolean collision(Rectangle2D object)  {
		if (shape.intersects(object)) {
			try {
				hitSound.open();
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return shape.intersects(object); // returns true if objects intersect
		}
		return false;
		}
}
