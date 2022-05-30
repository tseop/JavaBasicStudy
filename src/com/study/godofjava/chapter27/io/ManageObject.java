package com.study.godofjava.chapter27.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManageObject {
	public static void main(String[] args) {
		ManageObject manager = new ManageObject();
		String fullPath = "C:" + File.separator + "godofjava" + File.separator + "text" + File.separator + "serial.obj";

		SeriaDTO dto = new SeriaDTO("GodofJavaBook", 1, true, 100);
		manager.loadObject(fullPath);
	}

	public void saveObject(String fullPath, SeriaDTO dto) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream(fullPath);
			oos = new ObjectOutputStream(fos);

			oos.writeObject(dto);
			System.out.println("success");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void loadObject(String fullPath) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(fullPath);
			ois = new ObjectInputStream(fis);

			SeriaDTO dto = (SeriaDTO) ois.readObject();
			System.out.println(dto);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}

	}
}
