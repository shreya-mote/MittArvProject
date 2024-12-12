package com.mittarv.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mittarv.base.Keyword;
import com.mittarv.utils.WaitsFor;

public class HomePage {
	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}

	@FindBy(css = "button.Lg-body-01-semibold.nav_singin")
	private WebElement signInBttn;

	 @FindBy(css="img[src=\"/assets/close_cross-bc03bb3c.svg\"]")
	 private WebElement closePopUp;
	 
	 @FindBy(css="div.cross_icon")
	 private WebElement closePopUp2;
	 
	 @FindBy(css="input[placeholder=\"Your email address\"]")
	 private WebElement emailIdTextBox;
	 
	 @FindBy(xpath="//div[text()=\"Subscribe\"]")
	 private WebElement subscribeButton;
	 
	 @FindBy(xpath="//div[text()=\"Invalid email. Please enter a valid email address.\"]")
	 private WebElement ErrorMsgAlert;
	 
	 String ErrorMsg="Invalid email. Please enter a valid email address.";
	 
	public  void closePopOnHomePage() {
		WaitsFor.elementToBeClickableMethod(closePopUp);
		Keyword.clickOn(closePopUp);
		Keyword.clickOn(closePopUp2);
	}

	public void clickOnSignInButtn() {
		Keyword.clickOn(signInBttn);
	}
	public void clickOnSubscribeButton() {
		WaitsFor.elementToBeClickableMethod(subscribeButton);
		WaitsFor.VisibilityOfElemntMethod(subscribeButton);
		Keyword.scrollwindow(subscribeButton);
		Keyword.clickOn(subscribeButton);
	}
	public String getErrorMsg() {
		return Keyword.getText(ErrorMsgAlert);
	}
	
	
	

	

}
