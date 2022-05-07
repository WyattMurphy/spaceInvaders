import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class Missile extends Drawable {
	protected Rectangle2D shape;

	protected Missile(int x, int y) {
		super(x, y);
		shape = new Rectangle.Double(x,y,2,4);
	}

	@Override
	public void getPainted(Graphics2D g) {
		// method for painting white rectangle
		g.setColor(Color.WHITE);
		g.fill(shape);
		g.drawRect(x+12, y, 2, 4);
	}
	
	public Rectangle2D getDimesions() {
		var x = getX();
		var y = getY();
		
		return new Rectangle2D.Double(x,y,2,4);
	}
}
