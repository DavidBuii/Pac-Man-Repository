import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEvents implements KeyListener{
	
	private Player player;
	private Scene level;
	private int speed = 4;
	private String right = "agumon_1_2.png";
	private String left = "agumon left.png";
	private String up = "agumon up.png";
	private String down = "agumon down.png";
	private String lastMove = "";
	
	
	public KeyEvents(Player player, Scene level) {
		this.level = level;
		this.player = player;
	}
	
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()== KeyEvent.VK_RIGHT) {
			//JOptionPane.showMessageDialog(null, "Right key is pressed");
			player.setxAxis(player.getxAxis()+ speed);
			player.setImagePath(right);
			level.repaint();
			lastMove = right;
		}
		else if (e.getKeyCode()== KeyEvent.VK_LEFT) {
			//JOptionPane.showMessageDialog(null, "Left key is pressed");
			player.setxAxis(player.getxAxis()- speed);
			player.setImagePath(left);
			level.repaint();
			lastMove = left;
		}
		else if (e.getKeyCode()== KeyEvent.VK_UP) {
			//JOptionPane.showMessageDialog(null, "UP key is pressed");
			player.setyAxis(player.getyAxis()- speed);
			player.setImagePath(up);
			level.repaint();
			lastMove = up;
		}
		else if (e.getKeyCode()== KeyEvent.VK_DOWN) {
			//JOptionPane.showMessageDialog(null, "DOWN key is pressed");
			player.setyAxis(player.getyAxis()+ speed);
			player.setImagePath(down);
			level.repaint();
			lastMove = down;
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
