package com.study.godofjava.chapter26.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ManageTextFile {
	public static void main(String[] args) {
		ManageTextFile manager = new ManageTextFile();
		int numberCount = 10;
		String fullPathName = "C:" + File.separator + "godofjava" + File.separator + "text" + File.separator
				+ "numbers.txt";

		manager.writeFile(fullPathName, numberCount);
		manager.readFile(fullPathName);

	}

	public void writeFile(String fileName, int numberCount) {
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {
			fileWriter = new FileWriter(fileName, true);
			bufferedWriter = new BufferedWriter(fileWriter);

			for (int i = 0; i < 10; i++) {
				bufferedWriter.write(Integer.toString(i));
				bufferedWriter.newLine();
			}
			System.out.println("Writer Success!");

		} catch (IOException e) {
			e.printStackTrace();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			if (bufferedWriter != null) {
				try {
					bufferedWriter.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fileWriter != null) {
				try {
					fileWriter.close();

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void readFile(String fileName) {
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;

		try {
			fileReader = new FileReader(fileName);
			bufferedReader = new BufferedReader(fileReader);

			String data;

			while ((data = bufferedReader.readLine()) != null) {
				System.out.println(data);
			}

			System.out.println("read success !");

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fileReader != null) {
				try {
					fileReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void readFileWithScanner(String fileName) {
		File file = new File(fileName);
		Scanner sc = null;

		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}

			System.out.println("read success !");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if (sc != null) {
				sc.close();
			}
		}

	}
}
