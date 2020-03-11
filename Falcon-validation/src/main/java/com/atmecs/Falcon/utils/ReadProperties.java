package com.atmecs.Falcon.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
	public static Properties property;
	public static Properties loadProperty(String filePath) throws Exception {
		property = new Properties();
		property.load(new FileInputStream(filePath));
		return property;
	}
	

}
