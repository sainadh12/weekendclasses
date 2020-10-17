package com.weekend.genericlibs;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;

public class DataReader extends WebActions{

	static Properties props;
	static String propertiesPath = "C:\\Users\\Sainadh\\eclipse-workspace\\mavensample\\data.properties";

	public static void readData() {
		try {
			FileReader propertiesFile = new FileReader(propertiesPath);
			props = new Properties();
			props.load(propertiesFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getData(final String key) {

		readData();
		return props.getProperty(key);
	}
}