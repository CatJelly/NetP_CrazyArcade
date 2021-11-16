import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Player extends MapObject {
	private int bomb;
	private int power;
	private int speed;
	private ImageIcon [] upImage = null;
	private ImageIcon [] downImage = null;
	private ImageIcon [] leftImage = null;
	private ImageIcon [] rightImage = null;
	
	public Player(int xPos, int yPos, int code, String name, JPanel gamePanel) {
		super(xPos, yPos, code, name, gamePanel);
		this.bomb = 1;
		this.power = 1;
		this.speed = 1;
		
		try {
			Image img = ImageIO.read(new File("character/front1.bmp"));
			this.image = new ImageIcon(img);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@Override
	public void printObject() {
		// TODO Auto-generated method stub
		
	}
}
