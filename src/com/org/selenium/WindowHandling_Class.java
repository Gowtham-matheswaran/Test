package com.org.selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WindowHandling_Class {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("--disable-notifications");
		co.addArguments("start-maximized");
		WebDriver driver =new ChromeDriver(co);
		/*driver.get("https://www.snapdeal.com/");

		WebElement clkMensFashion = driver.findElement(By.xpath("(//span[@class='labelIcon'])[1]"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(clkMensFashion).build().perform();

		WebElement  clkTshirt = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
		Thread.sleep(3000);
		clkTshirt.click();

		WebElement clkShoeForMen = driver.findElement(By.xpath("//a[text()='shoes for men']"));
		Thread.sleep(3000);
		clkShoeForMen.click();

		WebElement clkBlue = driver.findElement(By.xpath("(//span[@class='filter-color-tile'])[1]"));
		Thread.sleep(3000);
		clkBlue.click();*/

		//		WebElement clkSize = driver.findElement(By.xpath("(//a[@class='filter-name'])[48]"));
		//		Thread.sleep(5000);
		//		clkSize.click();

		//		WebElement clkBrand= driver.findElement(By.xpath("(//a[@class='filter-name'])[60]"));
		//		Thread.sleep(3000);
		//		clkBrand.click();

		//		WebElement shoeClk = driver.findElement(By.linkText("Campus VIBGYOR Blue  Men's Sports Running Shoes"));
		//		Thread.sleep(3000);
		//		shoeClk.click();

		driver.get("https://the-internet.herokuapp.com/");

		WebElement clkDropDown = driver.findElement(By.xpath("//a[text()='Dropdown']"));
		clkDropDown.click();

		WebElement selectDd = driver.findElement(By.id("dropdown"));
		Select s=new Select(selectDd);
		s.selectByIndex(1);

		Thread.sleep(3000);
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		WebElement clkElement = driver.findElement(By.xpath("//a[text()='Elemental Selenium']"));
		clkElement.click();

		Thread.sleep(3000);
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);

		for(String base:child) {
			if(!base.equals(parent)) {
				driver.switchTo().window(base);
				String title = driver.getTitle();
				System.out.println(title);
			}
		}

		WebElement clkEmail = driver.findElement(By.id("email"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Gowthammohan@gmail.com')", clkEmail);

		Thread.sleep(3000);
		WebElement selectLanguage = driver.findElement(By.xpath("//select[@class='dropdown-language']"));
		Select se=new Select(selectLanguage);
		se.selectByIndex(2);
		driver.close();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		

		/*Thread.sleep(3000);
		driver.close();*/

		//		Thread.sleep(3000);
		//		driver.navigate().back();
		//		Thread.sleep(3000);
		//		driver.navigate().refresh();
		//		Thread.sleep(3000);
		//		driver.close();


		/*String parent1=driver.getWindowHandle();
		System.out.println(parent1);

		Set<String> child1 = driver.getWindowHandles();
		System.out.println(child1);

		for(String base:child) {
			if(!base.equals(parent1)) {
				driver.switchTo().window(base);
			}
		}*/

	}
}
