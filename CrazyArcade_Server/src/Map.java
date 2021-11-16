import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JPanel;

public class Map {
	private int [][] mapInfo = new int[13][15];
	
	public Map(String path) {
		try {
			int row = 0;
			BufferedReader reader = new BufferedReader(new FileReader(path));
			String temp;
			while((temp = reader.readLine()) != null) {
				String [] temp_arr = temp.split(" ");
				for(int i=0; i<mapInfo[row].length; i++) {
					mapInfo[row][i] = temp_arr[i].charAt(0) - '0';
				}
				row++;
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void mapLoad() {
		
	}
	public int [][] getMapInfo() { return mapInfo; }
}
