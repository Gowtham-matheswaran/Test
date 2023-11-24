package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop_Class {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://jqueryui.com/");
		WebElement dropClk = driver.findElement(By.linkText("Droppable"));
		dropClk.click();

		int size = driver.findElements(By.xpath("//iframe[@class='demo-frame']")).size();
		System.out.println(size);

		Thread.sleep(3000);
		/*//index
		driver.switchTo().frame(0);

		//name
		driver.switchTo().frame("name");

		//id
		driver.switchTo().frame("id");*/

		//WebElement
		WebElement web = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(web);

		WebElement drag = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Thread.sleep(3000);
		Actions act=new Actions(driver);
		act.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();

		/*driver.get("https://demoqa.com/alerts");
		driver.get(" https://jqueryui.com/");

		WebElement dropClk = driver.findElement(By.linkText("Droppable"));
		dropClk.click();

		int frameSize = driver.findElements(By.xpath("//iframe[@class='demo-frame']")).size();
		System.out.println(frameSize);

		driver.switchTo().frame(0);

		WebElement drag = driver.findElement(By.id("draggable"));

		WebElement drop = driver.findElement(By.id("droppable"));

		Actions act=new Actions(driver);
		act.clickAndHold(drag).moveToElement(drap).release(drag).build().perform();*/



	}
}
