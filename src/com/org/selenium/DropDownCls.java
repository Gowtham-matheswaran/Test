package com.org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropDownCls {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");

		//SingleDD
		/*	WebElement clkWithCoffe = driver.findElement(By.xpath("//option[text()='With sugar']"));
		clkWithCoffe.click();*/

		//DoubleDD
		/*WebElement findElement = driver.findElement(By.xpath("//form[text()='I like my coffee with:']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scroolIntoView(false)",findElement );*/
		//		WebElement clkMultipleDrop = driver.findElement(By.xpath("//select[@name='coffee2']"));
		//		Select s=new Select(clkMultipleDrop);
		//		Thread.sleep(5000);

		//				s.selectByVisibleText("Cream");
		//				s.selectByValue("milk2");

		//		List<WebElement> opTions = s.getOptions();
		//		for(int i=0;i<=opTions.size()-1;i++) {
		//			s.selectByIndex(i);
		//			Thread.sleep(3000);
		//		}
		//		for(int i=opTions.size()-1;i>=0;i--) {
		//			s.deselectByIndex(i);
		//			Thread.sleep(3000);
		//		}
		//	}

		//SelectbyIndex
//		WebElement findElement = driver.findElement(By.xpath("//select[@name='coffee2']"));
//		Select s=new Select(findElement);
//		s.selectByIndex(0);
//		s.selectByIndex(1);
//		s.selectByIndex(2);
//		s.selectByIndex(3);
//		Thread.sleep(3000);
//		s.deselectAll();
//		findElement.getText();

	}
}