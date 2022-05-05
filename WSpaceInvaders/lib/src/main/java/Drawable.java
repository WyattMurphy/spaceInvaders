import java.awt.Graphics2D;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;

/**
 * 
 * @author dustymcbender
 * 
 *
 */

public abstract class Drawable {
	protected int x; // x cord
	protected int y; // y cord
	protected int height; // height of object
	protected int width; // width of object
	
	// constructor
	public Drawable(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// field getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getHeight() {
		return height;
	}
	public int getWidth() {
		return width;
	}
	
	// field setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int x) {
		this.y = x;
	}
	public void setHeight(int x) {
		this.height = x;
	}
	public void setWidth(int x) {
		this.width = x;
	}
	
	// abstract method for painting object
	public abstract void getPainted(Graphics2D g);
	
	// move methods -> change x, y position by given int
	public void moveVert(int n) {
		y += n;
	}
	public void moveHoriz(int n) {
		x += n;
	}
	
	// get image given file name
	public Image getImage(String filename) {
		// create url object given file name
		URL url = getClass().getResource(filename);
		// create imageicon by passing url as argument to imageicon constructor
		ImageIcon icon = new ImageIcon(url);
		return icon.getImage(); // return stored image
		
	}
	
	public Clip getSound(String filename) {
		Clip clip = null;
		try {
			InputStream in = getClass().getResourceAsStream(filename);
			InputStream buf = new BufferedInputStream(in);
			AudioInputStream stream = AudioSystem.getAudioInputStream(buf);
			clip = AudioSystem.getClip();
			clip.open(stream);
		}catch(UnsupportedAudioFileException | IOException | LineUnavailableException e) {
			e.printStackTrace();
			}
		return clip;
		}
		
	
	

}
