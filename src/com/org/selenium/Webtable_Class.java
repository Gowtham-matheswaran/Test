 package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Webtable_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://demoqa.com/webtables");

		//Particular data
//		WebElement parData = driver.findElement(By.xpath("//div[text()='12000']"));
//		String text3 = parData.getText();
//		System.out.println(text3);

		Thread.sleep(3000);
		//Particular row
//		WebElement text = driver.findElement(By.xpath("(//div[@class='rt-tr -odd'])[1]"));
//		String text2 = text.getText();
//		System.out.println(text2);

//		Thread.sleep(3000);
		//Headline row
		WebElement headRow = driver.findElement(By.xpath("//div[@class='rt-tr']"));
		String text4 = headRow.getText();
		System.out.println(text4);
	}

}
