package com.study.godofjava.chapter26.io;

import java.io.File;
import java.io.IOException;

public class FileManageClass {

	public static void main(String[] args) {
		FileManageClass sample = new FileManageClass();
		String pathName = "C:" + File.separator + "godofjava" + File.separator + "text";
		String fileName = "test.txt";

		sample.checkFile(pathName, fileName);
	}

	public void checkFile(String pathName, String fileName) {
		File file = new File(pathName, fileName);

		try {
			System.out.println("Create result : " + file.createNewFile());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
