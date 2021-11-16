import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JPanel;

public class Map {
	private JPanel gamePanel = null;
	private int [][] mapInfo = new int[13][15];
	private MapObject [][] objects = new MapObject[13][15];
	
	public Map(JPanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	public void setMapInfo(int [][] mapInfo) {
		this.mapInfo = mapInfo; 
		for(int i=0; i<mapInfo.length; i++) {
			for(int j=0; j<mapInfo[i].length; j++) {
				switch(mapInfo[i][j]) {
				case 0:
					objects[i][j] = (new Tile(j, i, 0, "Tile", gamePanel));
					break;
				case 1:
					objects[i][j] = (new Wall(j, i, 1, "Wall", gamePanel));
					break;
				case 2:
					objects[i][j] = (new Block(j, i, 2, "Block", gamePanel));
					break;
				}
			}
		}
	}
	public void mapPrint() {
		for(int i=0; i<objects.length; i++) {
			for(int j=0; j<objects[i].length; j++) {
				objects[i][j].printObject();
			}
		}
	}
}
