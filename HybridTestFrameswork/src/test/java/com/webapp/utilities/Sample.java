package com.webapp.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Sample {

	public static void main(String[] args) {

		Properties obj = new Properties();

		File f = new File("./Configuration/object.property");

		FileInputStream fis = null;

		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			obj.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String val = obj.getProperty("user_name");

		System.out.println(val);

	}

}
