package com.study.godofjava.chapter26.io;

import java.io.File;
import java.io.FilenameFilter;

public class JPEGFilenameFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		if (name.endsWith(".jpg")) {
			return true;
		}
		return false;
	}

}
