import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Player {
	private int lives;
	private int xAxis;
	private int yAxis;
	private String imagePath;
	private boolean isAlive;
	private Image image;

	public Player(int lives, int xAxis, int yAxis, String imagePath, boolean isAlive) {
		super();
		this.setLives(lives);
		this.setImagePath(imagePath);
		this.setAlive(isAlive);
		this.setxAxis(xAxis);
		this.setyAxis(yAxis);
		
		/*		try {
	    	image = ImageIO.read(new File(imagePath));
	    } catch (IOException ioe) {
	    	System.out.println("Unable to load image file.");
	    }*/
	}

	public int getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	public int getxAxis() {
		return xAxis;
	}
	public void setxAxis(int xAxis) {
		if(isAlive){
			
			if(this.xAxis > 200) {
				this.xAxis = 200;
			}
			else if(this.xAxis < 0) {
				this.xAxis = 0;
			}
			else 
				this.xAxis = xAxis;
		}
		else
			this.xAxis = xAxis;
		System.out.println(xAxis+" " +yAxis);
	}
	public int getyAxis() {
		return yAxis;
	}
	public void setyAxis(int yAxis) {
		if(isAlive){
			if(this.yAxis > 260) {
				this.yAxis = 260;
			}
			else if(this.yAxis < 0) {
				this.yAxis = 0;
			}
			else 
				this.yAxis = yAxis;
		}
		else
			this.yAxis = yAxis;
		System.out.println(xAxis+" " +yAxis);
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		if(imagePath == null) {
			JOptionPane.showMessageDialog(null,"Invalid String!");
			System.exit(1);
		}
		else
			this.imagePath = imagePath;
	}
	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public void drawPlayer(Graphics g) {

		ImageIcon img = new ImageIcon(imagePath);
		g.drawImage(img.getImage(), xAxis, yAxis ,null);
	}

}
