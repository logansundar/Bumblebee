package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationAdactin extends Base {

	public ConfirmationAdactin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "order_no")
	private WebElement orderNum;

	public WebElement getOrderNum() {
		return orderNum;
	}
	
}
