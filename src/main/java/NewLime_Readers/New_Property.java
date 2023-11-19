package NewLime_Readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class New_Property {

	static FileReader fr;
	public static Properties propReader() {
		File f = new File ("C:\\Users\\Aravindan\\eclipse-workspace\\NewLimeRoad\\src\\main\\java\\NewLimeRoad_Project\\NewLime.Properties");
		
		try {
			fr = new FileReader (f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties p = new Properties();
		try {
			p.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return p;
		
		
	}

}
