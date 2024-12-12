package com.mittarv.base;

import org.testng.annotations.BeforeMethod;

import com.mittarv.utils.PropertyFile;

public class TestBase {
	@BeforeMethod
	public void setup() {
		Keyword.openBrowser(PropertyFile.getBrowser());
		Keyword.launchUrl(PropertyFile.getUrl());
		Keyword.driver.manage().window().maximize();
	}
	/*@AfterMethod
	public void tearDown() {
		Keyword.driver.quit();
	}*/


}
