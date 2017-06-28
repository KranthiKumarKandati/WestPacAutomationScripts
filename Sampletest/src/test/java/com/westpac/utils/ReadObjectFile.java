package com.westpac.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class ReadObjectFile {
	Properties p = new Properties();
	  public Properties getObjectRepository() throws IOException{
		  File dir = new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\westpac\\resources\\");
		  String[] files = dir.list();
		  InputStream stream = null;
		  
		  String GetFileName=ReadObjectFile.Handle_configfile("LoadObjectFile");
		  StringBuilder stringBuilder = new StringBuilder();

		  stringBuilder.append(GetFileName);
		  stringBuilder.append(".properties");
		  String PropertyFile = stringBuilder.toString();
		  //System.out.println(PropertyFile);
		try {
			for (String aFile : files) {
			stream = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\westpac\\resources"+PropertyFile));
			p.load(stream);
			
			}			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}		  
	        return p;
	      
	  }
	  public static String Handle_configfile(String key) 
		{
		  Properties prop = new Properties();
			FileInputStream fis = null;
			
			try {
				
				fis = new FileInputStream(new File(System.getProperty("user.dir")+"\\src\\test\\java\\com\\westpac\\resources\\object.properties"));
				
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			try {
				prop.load(fis);
				
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			return prop.getProperty(key);
		}
	
}
