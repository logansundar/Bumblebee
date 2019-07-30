package org.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sundar\\eclipse-workspace\\sundar\\Shopping\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.quit();
}
}
