package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FrameCount extends Base {
public static void main(String[] args) {
	browser();
	launchUrl("http://demo.automationtesting.in/Frames.html");
	List<WebElement> frame= driver.findElements(By.tagName("iframe"));
	System.out.println("Frame Count:"+frame.size());
	close();
	}
}
