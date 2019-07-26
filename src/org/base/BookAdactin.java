package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAdactin extends Base {

	public BookAdactin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private WebElement txtFirstName;
	
	@FindBy(id = "last_name")
	private WebElement txtLastName;
	
	@FindBy(id = "address")
	private WebElement txtAddress;

	@FindBy(id = "cc_num")
	private WebElement txtccNum;

	@FindBy(id = "cc_type")
	private WebElement txtccType;

	@FindBy(id = "cc_exp_month")
	private WebElement expMonth;

	@FindBy(id = "cc_exp_year")
	private WebElement expYear;

	@FindBy(id = "cc_cvv")
	private WebElement cvv;

	@FindBy(id = "book_now")
	private WebElement btnBook;

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtccNum() {
		return txtccNum;
	}

	public WebElement getTxtccType() {
		return txtccType;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBtnBook() {
		return btnBook;
	}


}
