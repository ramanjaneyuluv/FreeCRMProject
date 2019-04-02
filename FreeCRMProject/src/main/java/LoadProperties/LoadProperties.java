package LoadProperties;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperties {
	
	public static Properties prop;
	
	
	public String loadProperties(String key, String Value) {
		try {
			prop=new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\Baji786\\eclipse-workspace\\FreeCRMProject\\src\\main\\java\\ConfigFiles\\Config.properties");
			prop.load(file);
		}catch(Exception e) {
			System.out.println(e);
			
		}
		return key;
		
	}

}
