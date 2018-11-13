import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Level1 extends JPanel implements KeyListener{

	private JFrame window = new JFrame("Level 1");
	private ImageIcon background = new ImageIcon("background_0.png");
	private Player player = new Player(3, 5, 28, "agumon_1_2.png", true);
	private int speed = 5;

	public Level1() {

		this.setFocusable(true);
		this.addKeyListener(this);
		window.add(this);

		window.setSize(230, 320);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public void paint(Graphics g) {
		g.drawImage(background.getImage(), 0, 0, null);
		player.drawPlayer(g);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			//JOptionPane.showMessageDialog(null, "Right key is pressed");
			player.setxAxis(player.getxAxis()+ speed);
			player.setImagePath("agumon_1_2.png");
			this.repaint();
		}
		else if (e.getKeyCode()== KeyEvent.VK_LEFT) {
			//JOptionPane.showMessageDialog(null, "Left key is pressed");
			player.setxAxis(player.getxAxis()- speed);
			player.setImagePath("agumon left.png");
			this.repaint();
		}
		else if (e.getKeyCode()== KeyEvent.VK_UP) {
			//JOptionPane.showMessageDialog(null, "UP key is pressed");
			player.setyAxis(player.getyAxis()- speed);
			player.setImagePath("agumon up.png");
			this.repaint();
		}
		else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			//JOptionPane.showMessageDialog(null, "DOWN key is pressed");
			player.setyAxis(player.getyAxis()+ speed);
			player.setImagePath("agumon down.png");
			this.repaint();
		}


	}

	@Override
	public void keyReleased(KeyEvent e) {

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
