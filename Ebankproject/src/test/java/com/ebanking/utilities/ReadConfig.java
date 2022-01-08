package com.ebanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	public static Properties pro;
	public ReadConfig() {
	File file=new File("./Configuration/dataconfig.properties");
	try {
	FileInputStream fls=new FileInputStream(file);
	pro=new Properties();
	pro.load(fls);
	}
	catch(IOException e) {
		System.out.println(e.getStackTrace());
	}
	}
	public String getusername() {
		return pro.getProperty("username");
	}
	public String getpassword() {
		return pro.getProperty("password");
	}
	public String geturl() {
		return pro.getProperty("url");
	}
}
