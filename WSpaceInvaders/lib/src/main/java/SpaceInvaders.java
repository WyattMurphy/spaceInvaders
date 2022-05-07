import java.awt.Font;
import java.util.Timer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class SpaceInvaders extends JFrame{
	// fields representing Lists of different Ship objects
	private Timer timer;
//	private List<InvaderTop> invtop = new ArrayList<>();
//	private List<InvaderMid> invmid = new ArrayList<>();
//	private List<InvaderMid> invmid2 = new ArrayList<>();
//	private List<InvaderBot> invbot = new ArrayList<>();
//	private List<Invader> allInvaders = new ArrayList<>();
	public SpaceInvaders(){
		// Generating GUI Menu Options
		setTitle("Space Invaders");
		setSize(500, 450);
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		JMenu program = new JMenu("Game");
		JMenu help = new JMenu("Help");
		menubar.add(program);
		menubar.add(help);
		JMenuItem newGame = program.add("NEW GAME");
		JMenuItem about = help.add("About...");
		program.addSeparator();
		JMenuItem resume = program.add("resume");
		JMenuItem pause = program.add("pause");
		program.addSeparator();
		JMenuItem exit = program.add("Exit");
		Font myFont1 = new Font("Serif", Font.BOLD, 12);
		JLabel score = new JLabel("Score");
		score.setFont(myFont1);
		setLocationRelativeTo(null); //put it in the center of the sceen
		setDefaultCloseOperation( DISPOSE_ON_CLOSE );
		
		
		// player game state decisions
		newGame.addActionListener(e -> {
			int response = JOptionPane.showConfirmDialog(SpaceInvaders.this, "Start a new Game?");
			if(response == JOptionPane.YES_OPTION);
		});
		about.addActionListener(e -> {
			JOptionPane.showMessageDialog(SpaceInvaders.this, " SPACE INVADER \n Written by Jake Sita and Wyatt Murphy");
		});
		resume.addActionListener(e -> {
			
		});
		pause.addActionListener(e -> {
		});
		exit.addActionListener(e ->{
			int response = JOptionPane.showConfirmDialog(SpaceInvaders.this, "Exit Game");
			if(response == JOptionPane.YES_OPTION)
				dispose();
//				timer.stop();
			});
		
}
	
	// FIXME add remaining methods
	
	public static void main(String[] args) {
		SpaceInvaders a = new SpaceInvaders();
		a.setVisible(true);

	}
}
