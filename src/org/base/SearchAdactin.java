package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchAdactin extends Base {

	public SearchAdactin() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private WebElement txtLocation;
	
	@FindBy(id = "room_nos")
	private WebElement txtRoomNo;
	
	@FindBy(id = "child_room")
	private WebElement txtChildRoom;

	@FindBy(id = "Submit")
	private WebElement btnSearch;

	public WebElement getTxtLocation() {
		return txtLocation;
	}

	public WebElement getTxtRoomNo() {
		return txtRoomNo;
	}

	public WebElement getTxtChildRoom() {
		return txtChildRoom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

}
