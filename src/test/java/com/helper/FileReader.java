package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class FileReader {
	public static Properties p;

	public FileReader() throws Exception {
		File f = new File("C:\\Users\\Vinothraj\\WorkSpace\\CucumberLearn\\src\\test\\java\\com\\fbproperty\\data.property");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}

	public String getBrowserName() {
		String browsername = p.getProperty("browser");
		return browsername;
	}

	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	}
