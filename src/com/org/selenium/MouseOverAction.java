package com.org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {

	/*public static WebDriver driver;
	public static void Actions(WebElement web) {
		Actions act=new Actions(driver);
		act.moveToElement(web).build().perform();

	}*/

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		WebElement clkFashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act=new Actions(driver);
		act.moveToElement(clkFashion).build().perform();
		WebElement clkKids = driver.findElement(By.xpath("//a[text()='Kids']"));
		act.moveToElement(clkKids).build().perform();
		WebElement clkB$GTshirts = driver.findElement(By.xpath("//a[text()='Boys & Girls Tshirts']"));
		clkB$GTshirts.click();







	}
}
