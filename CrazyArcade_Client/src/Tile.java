import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Tile extends MapObject {
	public Tile(int xPos, int yPos, int code, String name, JPanel gamePanel) {
		super(xPos, yPos, code, name, gamePanel);

		try {
			String filename = String.format("maps/tile%d.bmp", CrazyArcadeClientView.random.nextInt(3) + 1);
			Image img = ImageIO.read(new File(filename));
			this.image = new ImageIcon(img);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}