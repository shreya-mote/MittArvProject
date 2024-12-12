package com.mittarv.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.Set;

public abstract class Keyword {
	public static RemoteWebDriver driver = null;

	public static void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid Browser");

		}
	}

	public static void launchUrl(String Url) {
		driver.get(Url);
	}

	public static void clickOn(WebElement element) {
		element.click();
	}

	public static boolean isMessageDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public String emailInput(String email) {
		String text = driver.findElement(By.xpath(email)).getText();
		return text;
	}

	public static String getText(WebElement element) {
		String textMsg = element.getText();
		return textMsg;
	}

	public static void sendKeys(WebElement element, String text) {
		element.sendKeys(text);

	}

	public static void scrollwindow(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
		js.executeScript("arguments[0].click();", element);

	}

	public static void switchToNewTab() {
		String originalWindow = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();

		if (allWindows.size() > 1) {
			for (String i : allWindows) {
				if (!i.equals(originalWindow)) {
					driver.switchTo().window(i);
					break;
				}
			}
		} else {
			System.out.println("No new tab opened.");
		}
	}
	public static String getNewTabTitle() {
		String newTabTitle=driver.getTitle();
		return newTabTitle;
	}

}
