package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTube extends Base{
public static void main(String[] args) throws InterruptedException {
	browser();
	launchUrl("https://www.youtube.com/");
	driver.manage().window().maximize();
	WebElement search = locID("search");
	type(search,"Tom&Jerry");
	WebElement searchBtn = locID("search-icon-legacy");
	btnClick(searchBtn);
	Thread.sleep(3000);
	WebElement video = locXpath("((//a[@class='yt-simple-endpoint style-scope ytd-video-renderer'])[1])");
	btnClick(video);
	}
}
