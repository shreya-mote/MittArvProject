package com.mittarv.testCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.mittarv.base.Keyword;
import com.mittarv.base.TestBase;
import com.mittarv.pages.HomePage;
import com.mittarv.utils.WaitsFor;

public class MittarvTestCases extends TestBase {
	@Test
	public static void verifyclickOnSignInBttnNavigateToNewTab() {
		HomePage homepage=new HomePage();
		homepage.closePopOnHomePage();
		homepage.clickOnSignInButtn();
		Keyword.switchToNewTab();
		String newTabTitle=Keyword.getNewTabTitle();
		Assert.assertTrue(newTabTitle.contains("Post Login"), "The new tab URL is incorrect.");
		}
	@Test
	public static void VerifySubscribeWithBlankEmail() {
		HomePage homepage=new HomePage();
		homepage.closePopOnHomePage();
		homepage.clickOnSubscribeButton();
		String errorMsg="Invalid email. Please enter a valid email address.";
		String errorMsgAlert=homepage.getErrorMsg();
		Assert.assertEquals(errorMsg, errorMsgAlert);
		
		
	}

}
