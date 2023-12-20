package dataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
		public static String getProperty(String key)
		{
			Properties pro = new Properties();
			try {
				pro.load(new FileInputStream(new File(".\\config\\config.properties")));
			} catch (IOException e) {
				System.out.println("file not found"+e.getMessage());
			}
			String val= pro.getProperty(key);
			return val;
			
			
		}

	


}
