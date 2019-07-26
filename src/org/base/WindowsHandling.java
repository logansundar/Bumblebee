package org.base;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

public class WindowsHandling extends Base {
public static void main(String[] args) {
	browser();
	launchUrl("https://www.hdfcbank.com/");
	driver.manage().window().maximize();
	WebElement popupClose = locXpath("//img[@class='popupCloseButton']");
	btnClick(popupClose);
	
	WebElement login = locID("loginsubmit");
	btnClick(login);
	
	String pWid = driver.getWindowHandle();
	Set<String> alWid = driver.getWindowHandles();
	for (String x : alWid) {
		if(!pWid.equals(x)) {
			driver.switchTo().window(x);
		}
		
	}
	WebElement netBanking = locXpath("((//a[text()='Continue to NetBanking'])[2])");
	btnClick(netBanking);
	
	driver.switchTo().frame("login_page");
	
	WebElement cont = locXpath("((//img[@alt='continue'])[1])");
	btnClick(cont);
	
	Alert al=driver.switchTo().alert();
	al.accept();
	
	WebElement uName=locXpath("//input[@type='text']");
	type(uName,"logansundar");
		
	driver.switchTo().window(pWid);
	
	WebElement login1 = locID("loginsubmit");
	btnClick(login1);
	
	String pWid1 = driver.getWindowHandle();
	Set<String> alWid1 = driver.getWindowHandles();
	int count =0;
	for (String x : alWid) {
		if(count==2){
			driver.switchTo().window(x);
		}
		count++;
}
}
}
