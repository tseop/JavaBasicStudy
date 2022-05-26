package com.study.godofjava.chapter24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesSample {
	public static void main(String[] args) {
		PropertiesSample sample = new PropertiesSample();
		sample.saveAndLoadProperties();
	}

	public void checkProperties() {
		Properties pro = System.getProperties();
		Set<Object> keySet = pro.keySet();

		for (Object obj : keySet) {
			System.out.println(obj + " : " + pro.get(obj));
		}
	}

	public void saveAndLoadProperties() {

		try {
			String fileName = "testSeop.xml";
			File propertiesFile = new File(fileName);
			FileOutputStream fileOut = new FileOutputStream(propertiesFile);
			Properties pro = new Properties();
			pro.setProperty("Writer", "Taeseop, Kim");
			pro.setProperty("WriterHome", "http://www.GodOfJava.com");
			pro.storeToXML(fileOut, "Basic Properties file");
			fileOut.close();

			FileInputStream fileIn = new FileInputStream(propertiesFile);
			Properties proLoad = new Properties();
			proLoad.loadFromXML(fileIn);
			fileIn.close();
			System.out.println(proLoad);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
