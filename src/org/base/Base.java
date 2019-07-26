package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {

		static WebDriver driver;
				
		public static WebDriver browser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sundar\\eclipse-workspace\\sundar\\BaseClassCreation\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;	
			}
		
		public static void launchUrl(String url) {
			driver.get(url);
			}
		
		public static WebElement locID(String loc) {
			WebElement loct = driver.findElement(By.id(loc));
			return loct;
			}
		public static WebElement locXpath(String loc) {

			WebElement loct = driver.findElement(By.xpath(loc));
			return loct;
			}
		public static void type(WebElement loct,String i ) {
			loct.sendKeys(i);
		}
		public static void btnClick(WebElement element) {
			element.click();
				}
		public static void close() {
			driver.close();
		}
		public static void moveTo(WebElement loc) {
			new Actions(driver).moveToElement(loc).perform();
		}
		public static void dClick(WebElement loc) {
			new Actions(driver).doubleClick(loc).perform();
			}
		public static void jsInsert(WebElement element,String value) {
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("arguments[0].setAttribute('value','value')",element);
			}
		public static String jsGet(WebElement element) {
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			String value = (String) jk.executeScript("return arguments[0].getAttribute('value')",element);
			return value;
			}
		public static void jsClick(WebElement element) {
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("arguments[0].click()",element);
			}
		public static void scrollDown(WebElement element) {
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("arguments[0].scrollIntoView(true)",element);
			}
		public static void scrollUp(WebElement element) {
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("arguments[0].scrollIntoView(false)",element);
			}

}

	