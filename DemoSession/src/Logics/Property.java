package Logics;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property {
	Properties prop1;
	
	public Property(String fileName) throws Exception {
		
		FileReader file = new FileReader(fileName);
		prop1 = new Properties();
		prop1.load(file);
	}
	
	public String getdata(String element) {
		
		return prop1.getProperty(element);
	}

}
