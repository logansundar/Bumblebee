package org.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebTable extends Base{
public static void main(String[] args) {
	browser();
	launchUrl("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
	
	List<WebElement> table = driver.findElements(By.tagName("table"));
	for (int t =0;t<table.size();t++) {
	WebElement table1 = table.get(t);
	
	List<WebElement> trow = table1.findElements(By.tagName("tr"));
	for(int i=0;i<trow.size();i++)
	{
		WebElement row = trow.get(i);
		
		List<WebElement>tdata1 = row.findElements(By.tagName("td"));
		for(int j=0;j<tdata1.size();j++)
		{
			WebElement data1 = tdata1.get(j);
			String txt1 = data1.getText();
			
			if(txt1.equals("Wireframes")) {
			
				System.out.println(txt1);
				System.out.println("table:"+t);
				System.out.println("row:"+i);
				System.out.println("cell:"+j);
				}
	}

}

}
	close();
	
}
}