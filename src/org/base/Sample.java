package org.base;

import org.openqa.selenium.WebElement;

public class Sample extends Base {
	public static void main(String[] args) {
		browser();
		launchUrl("https://www.facebook.com/");
		WebElement loct =locID("email");
		type(loct,"logansundar");
		close();
		}

}
