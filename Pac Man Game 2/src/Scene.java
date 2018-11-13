import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Scene extends JPanel {

	private int XAXIS_OF_ENEMY = 90;
	private int YAXIS_OF_ENEMY = 128;
	private JFrame window = new JFrame("Level 1");
	private Player player = new Player(3, 5, 28, "agumon_1_2.png", true);
	private KeyEvents keyEvents = new KeyEvents(player, this);
	private Enemy enemy = new Enemy(1, XAXIS_OF_ENEMY,YAXIS_OF_ENEMY, "Agumon_1_2.png",true);
	private Enemy enemy2 = new Enemy(1, XAXIS_OF_ENEMY +20,YAXIS_OF_ENEMY, "Agumon_1_2.png",true);
	public Scene() {
		
		window.addKeyListener(keyEvents);
		window.setFocusable(true);
		window.add(this);
		
		window.setSize(240, 320);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}

	public void paint(Graphics g) {
		ImageIcon background = new ImageIcon("background_0.png");
		g.drawImage(background.getImage(), 0, 0, null);
		player.drawPlayer(g);
		enemy.drawPlayer(g);
		enemy2.drawPlayer(g);
	}

}
