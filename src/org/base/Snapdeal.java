package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapdeal {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sundar\\eclipse-workspace\\sundar\\BaseClassCreation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.close();
}
}
