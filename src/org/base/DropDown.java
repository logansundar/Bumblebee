package org.base;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Base{
	public static void main(String[] args) {
		browser();
		launchUrl("https://www.facebook.com/");
		
		WebElement day = locID("day");
		Select s1 = new Select(day);
		boolean k = s1.isMultiple();
		System.out.println("Drop Down Box is multiple:"+ k);
		
		List<WebElement>days = s1.getOptions();
		for (WebElement x : days) {
			String d = x.getAttribute("Value");
			s1.selectByValue(d);		
				}
	String f = s1.getFirstSelectedOption().getText();
	System.out.println(f);
	}
	
	
}

		

/*		for(int i=0;i<skill.size();i++)
		{
		s1.selectByIndex(i);	
		}
*/