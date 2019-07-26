package org.base;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshot extends Base {
	public static void main(String[] args) throws IOException {
		browser();
		launchUrl("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot tk = (TakesScreenshot) driver;
		File s = tk.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\sundar\\Desktop\\Sundar\\Selenium\\sample1.png");
		FileUtils.copyFile(s,d);
		close();
		}

}
