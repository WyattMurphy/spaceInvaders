import java.awt.Graphics2D;
import java.awt.Image;

import javax.sound.sampled.Clip;

public class Base extends Ship {
	
	private Image baseHit = getImage("img_basehit.gif");
	private Image base = getImage("img_base.gif");
	private Clip baseFire = getSound("aud_basefire.wav");
	
	public Base(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void getPainted(Graphics2D g) {
		// local variables referencing bases position
		int x = getX();
		int y = getY();
		// determine which base image to paint
		if(this.hit) {
			g.drawImage(baseHit, x, y, null);
		}
			g.drawImage(base, x, y, null);
		
		
		
	}
	
	// method for shooting missile object
	public Missile shoot() {
		// play shooting audio
		baseFire.setFramePosition(0);
		baseFire.start();
		// determine base position
		int x = getX();
		int y = getY();
		// return new missile object 
		return new Missile(x, y-50);
		
	}

}
