package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WithoutsendkeysValuesend {

	public static void main(String[] args) {
		//		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		WebElement firstName = driver.findElement(By.id("email"));
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("arguments[0].setAttribute('value','JavaBoys')", firstName);
		
	}

}
