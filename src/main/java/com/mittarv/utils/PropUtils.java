package com.mittarv.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {
	public static String readPropertiesFile(String filePath,String key) {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(filePath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop=new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value=prop.getProperty(key);
		return value;
	}

}
