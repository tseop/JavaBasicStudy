package com.study.godofjava.chapter26.io;

import java.io.File;
import java.io.FileFilter;

public class JPGFileFilter implements FileFilter {

	@Override
	public boolean accept(File pathname) {
		if (pathname.isFile()) {
			String fileName = pathname.getName();
			if (fileName.endsWith(".jpg")) {
				return true;
			}
		}
		return false;
	}

}
