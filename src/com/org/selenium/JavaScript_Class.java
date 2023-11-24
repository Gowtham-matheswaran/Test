package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class JavaScript_Class {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.snapdeal.com/");

		//		WebElement scrollDown = driver.findElement(By.xpath("//p[text()='Connect']"));
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		js.executeScript("arguments[0].scrollIntoView(true)",scrollDown);

		/*Thread.sleep(3000);
		WebElement scrollUp = driver.findElement(By.xpath("//div[text()='T-Shirts & Shirts']"));
		//		JavascriptExecutor js1=(JavascriptExecutor)driver;
		Object upClk = js.executeScript("arguments[0].scrollIntoViwe(false)",scrollUp);
		js.executeScript("arguments[0].click",upClk);*/

		//ValueSet(or)SendKeys
		Thread.sleep(3000);
		WebElement sendPinCode = driver.findElement(By.id("pincode-check-nba"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','600038')",sendPinCode);
		Thread.sleep(5000);
		//ValueGet
		Object getValue = js.executeScript("return arguments[0].getAttribute('value')",sendPinCode);
		System.out.println(getValue);

		WebElement clkSubmit = driver.findElement(By.xpath("//span[text()='SUBMIT']"));
		clkSubmit.click();

		//Click
		//		Thread.sleep(3000);
		//		WebElement clkSubmit = driver.findElement(By.xpath("//span[text()='SUBMIT']"));
		//		js.executeScript("arguments[0].Click",clkSubmit);


	}
}