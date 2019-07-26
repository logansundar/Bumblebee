package org.base;

import org.openqa.selenium.WebElement;

public class Scroll extends Base {
public static void main(String[] args) throws InterruptedException {
	browser();
	launchUrl("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement tamil = locXpath("((//a[@class='_sv4'])[1])");
	scrollDown(tamil);
	Thread.sleep(3000);
	WebElement uName = locID("email");
	scrollUp(uName);
	}
}
