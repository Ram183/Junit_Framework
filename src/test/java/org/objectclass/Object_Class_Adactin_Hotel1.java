package org.objectclass;


import org.baseclass.Base_Class;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Object_Class_Adactin_Hotel1 extends  Base_Class{

	public Object_Class_Adactin_Hotel1() {

			PageFactory.initElements(driver, this);
			
	}
	
	@FindBy(id="username_show")
	private WebElement welcomeNotes;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement numberOfRooms;
	
	@FindBy(id="adult_room")
	private WebElement adultsPerRoom;
	
	@FindBy(id="child_room")
	private WebElement childrenPerRoom;
	
	@FindBy(id="Submit")
	private WebElement searchButton;

	public WebElement getWelcomeNotes() {
		return welcomeNotes;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

}
