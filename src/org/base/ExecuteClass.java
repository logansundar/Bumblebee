package org.base;

import org.openqa.selenium.WebElement;

public class ExecuteClass extends Base{
public static void main(String[] args) throws InterruptedException {
	browser();
	launchUrl("http://www.adactin.com/HotelApp/");
	
	LoginAdactin page = new LoginAdactin();
	type(page.getTxtUserName(),"logansundar");
	type(page.getTxtPassword(),"sundar");
	btnClick(page.getBtnLogin());
	
	SearchAdactin page1 = new SearchAdactin();
	type(page1.getTxtLocation(),"London");
	type(page1.getTxtRoomNo(),"1 - One");
	type(page1.getTxtChildRoom(),"1 - One");
	btnClick(page1.getBtnSearch());
	
	SelectAdactin page2 = new SelectAdactin();
	btnClick(page2.getBtnSelectHotel());
	btnClick(page2.getBtnCont());
	
	Thread.sleep(3000);
	
	BookAdactin page3 = new BookAdactin();
	type(page3.getTxtFirstName(),"Sundaravel");
	type(page3.getTxtLastName(),"Loganathan");
	type(page3.getTxtAddress(),"Chennai");
	type(page3.getTxtccNum(),"1234567891234123");
	type(page3.getTxtccType(), "Visa");
	type(page3.getCvv(),"2246");
	type(page3.getExpMonth(),("May"));
	type(page3.getExpYear(),"2020");
	btnClick(page3.getBtnBook());
	
	Thread.sleep(5000);
	
	ConfirmationAdactin page4=new ConfirmationAdactin();
	
	Thread.sleep(5000);
	WebElement orderNum = page4.getOrderNum();
	String on = orderNum.getAttribute("value");
	System.out.println("Order Number is:"+on);
	close();
}
}
