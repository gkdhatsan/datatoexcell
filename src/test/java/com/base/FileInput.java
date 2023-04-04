package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileInput {

	public static void main(String[] args) throws IOException {
		
		FileInputStream stream = new FileInputStream(System.getProperty("user.dir")+"\\Config\\config.properties");
		
		Properties properties =  new Properties();
		properties.load(stream);
		Object object = properties.get("url");
		String s = (String) object;
		System.out.println(s);
		
	}

}
