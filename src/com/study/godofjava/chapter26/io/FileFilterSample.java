package com.study.godofjava.chapter26.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileFilterSample {
	public static void main(String[] args) {
		FileFilterSample sample = new FileFilterSample();
		String pathName = "C:" + File.separator + "godofjava" + File.separator + "text" + File.separator + "test.jpg";

		sample.checkImage(pathName);
	}

	public void checkList(String pathName) {
		File file;

		file = new File(pathName);
		File[] mainFileList = file.listFiles();
		mainFileList = file.listFiles(new JPGFileFilter());

		for (File data : mainFileList) {
			System.out.println(data.getName());
		}
	}

	public void checkImage(String pathName) {
		byte[] data;
		FileInputStream file = null;
		try {
			file = new FileInputStream(pathName);
			int a = file.read();
			data = new byte[a];

			file.read(data);
			for (byte temp : data) {
				System.out.print(temp + " ");
			}
			System.out.println();
			System.out.println(a);

		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				file.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
