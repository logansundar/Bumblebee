package org.base;

import org.openqa.selenium.WebElement;

public class Js extends Base{
	public static void main(String[] args) {
		browser();
		launchUrl("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement uName = locID("email");
		jsInsert(uName,"logansundar");
		WebElement pWd = locID("pass");
		jsInsert(pWd,"logansundar");
		String pWdValue = jsGet(pWd);
		System.out.println(pWdValue);
		WebElement lognBtn = locID("loginbutton");
		jsClick(lognBtn);
		close();
	}
}
