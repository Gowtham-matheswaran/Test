package com.org.selenium;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Alert_Class {
	public static void main(String [] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver =new ChromeDriver(co);
		driver.get("https://demoqa.com/alerts");

		/*WebElement clkBtn = driver.findElement(By.id("alertButton"));
		clkBtn.click();*/

		/*WebElement clkBtn = driver.findElement(By.id("timerAlertButton"));
		clkBtn.click();*/

		//		WebElement clkBtn = driver.findElement(By.id("confirmButton"));
		//		clkBtn.click();

		//		WebElement clkBtns = driver.findElement(By.id("promtButton"));
		//		Thread.sleep(5000);
		//		clkBtns.click();

		//		Thread.sleep(5000);
		Alert alt = driver.switchTo().alert();

		String text = alt.getText();
		System.out.println(text);

		//		Thread.sleep(5000);
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		js.executeScript("arguments[0].setAttribute('value','Gowtham')",clkBtns);
		//		Thread.sleep(3000);
		//		alt.sendKeys("Gowtham");
		//		alt.accept();
		//		alt.dismiss();


	}

}
