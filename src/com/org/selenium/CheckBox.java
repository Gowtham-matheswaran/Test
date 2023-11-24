package com.org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		List<WebElement> clkCheckBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<clkCheckBox.size();i++) {
			clkCheckBox.get(i).click();
			Thread.sleep(2000);
		}
//		for(WebElement web:clkCheckBox) {
//			web.click();
//		}
		


	}
}
