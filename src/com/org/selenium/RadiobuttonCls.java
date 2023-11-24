package com.org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RadiobuttonCls {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.ironspider.ca/forms/checkradio.htm");
		WebElement down = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",down);
		Thread.sleep(5000);
		
		//RadiobtnClk
		List<WebElement> clkRadioBtn = driver.findElements(By.xpath("//input[@type='radio']"));
		for(int i =0 ;i<clkRadioBtn.size();i++) {
			clkRadioBtn.get(2).click();
			Thread.sleep(3000);
		}
		
		//CheckboxClk
		WebElement up = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
		js.executeScript("arguments[0].scrollIntoView(false)",up );
		Thread.sleep(3000);
		List<WebElement> cheox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i =0 ;i<cheox.size();i++) {
			cheox.get(i).click();
			Thread.sleep(3000);
		}
	}
}
