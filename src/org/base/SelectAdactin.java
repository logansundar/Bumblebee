package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectAdactin extends Base {

	public SelectAdactin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "radiobutton_1")
	private WebElement BtnSelectHotel;

	@FindBy(id = "continue")
	private WebElement BtnCont;

	public WebElement getBtnSelectHotel() {
		return BtnSelectHotel;
	}

	public WebElement getBtnCont() {
		return BtnCont;
	}

}
