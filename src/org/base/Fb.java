package org.base;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fb extends Base{
public static void main(String[] args) throws InterruptedException {
	browser();
	launchUrl("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(10000);
	
	driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	WebDriverWait w = new WebDriverWait(driver, 30);
	WebElement e = w.until(ExpectedConditions.elementToBeClickable(By.id("Login")));
			
	
	Wait w1 = new FluentWait(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(30,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	WebElement uName1 = (WebElement) w1.until(ExpectedConditions.elementToBeClickable(By.id("login")));		
	
	WebElement uName = locID("email");
	type(uName,"Good Night Jerry");
	close();
	}
}
