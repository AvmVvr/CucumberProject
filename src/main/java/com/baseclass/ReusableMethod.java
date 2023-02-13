package com.baseclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class ReusableMethod {
	public static WebDriver driver;

	public static void browserLaunch(String browser_Name) {
		try {
			if (browser_Name.equalsIgnoreCase("chrome")) {
				driver = new ChromeDriver();
			} else if (browser_Name.equalsIgnoreCase("firefox")) {
				driver = new FirefoxDriver();
			} else {
				System.out.println("try edge or FireFox");
			}
		} catch (Exception e) {
			System.out.println("check thr browser Launch code");
		}
		driver.manage().window().maximize();
	}

	public static void webSiteLaunch(String Url) {
		driver.get(Url);
	}

	public static void alertPopup(WebElement element, String okOrCancel) throws InterruptedException {
		element.click();
		if (okOrCancel.equalsIgnoreCase("ok")) {
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		} else {
			Thread.sleep(3000);
			driver.switchTo().alert().dismiss();
			Thread.sleep(2000);
		}
	}

	public static void screenShot(String pathName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(pathName);
		Files.copy(source, target);
	}

	public static void sendkeys(WebElement element, String Value) {
		element.sendKeys(Value);
	}
	
	public static void id_sendkeys(String Idvalue,String InputText) {
		driver.findElement(By.id(Idvalue)).sendKeys(InputText);
	}
	public static void id_click(String Idvalue) {
		driver.findElement(By.id(Idvalue)).click();
	}
	
	public static void name_click(String Idvalue) {
		
		driver.findElement(By.name(Idvalue)).click();
	}

}
