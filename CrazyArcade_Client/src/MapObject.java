import javax.swing.*;

public abstract class MapObject {
	protected int xPos;
	protected int yPos;
	protected int code;
	protected String name;
	protected ImageIcon image = null;
	protected JPanel gamePanel = null;
	
	public MapObject(int xPos, int yPos, int code, String name, JPanel gamePanel) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.code = code;
		this.name = name;
		this.gamePanel = gamePanel;
	}
	
	public int [] getPos() {
		int [] pos = {xPos, yPos};
		return pos;
	}
	public String getName() {
		return name;
	}
	public void printObject() {
		gamePanel.add(new JLabel(image));
	}
}
