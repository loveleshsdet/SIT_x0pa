package config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import apputils.Reusable;

public class PropertiesFile {
	static 	Properties prop=new Properties();

	public static void main(String[] args) {
	readPropertiesFile();
//	writePropertiesFile();
//	readPropertiesFile();
	}
	public static void readPropertiesFile() {
	
		try {
			String absolutepath=new File("src//test//java//config//config.properties").getAbsolutePath();
			InputStream input=new FileInputStream(absolutepath);
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			Reusable.browser=prop.getProperty("browser");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
//	public static void writePropertiesFile() {
//		try {
//			OutputStream output=new FileOutputStream("C:\\Users\\paul\\TestFrame\\Framework\\src\\test\\java\\config\\config.properties");
//			prop.setProperty("browser", "chrome");
//			prop.store(output,null);
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
}
