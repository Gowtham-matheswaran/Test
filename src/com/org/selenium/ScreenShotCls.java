package com.org.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;

import com.google.common.io.Files;

public class ScreenShotCls {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:/Users/elcot/eclipse-workspace/Seleniumrecall/Browser1/chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.facebook.com/");
		TakesScreenshot tk=(TakesScreenshot)driver;
		File From = tk.getScreenshotAs(OutputType.FILE);
		File to=new File("C:/Users/elcot/eclipse-workspace/Seleniumrecall/ScreenShot/Gowtham.png");
		Files.copy(From, to);

		//		PARTICULAR SS
		//		WebElement scr= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		//		File from = scr.getScreenshotAs(OutputType.FILE);
		//		File to=new File("C:/Users/elcot/eclipse-workspace/Seleniumrecall/ScreenShot/Gowtham.png");
		//		Files.copy(from, to);

		//Multiple SS
		//		for(int i =0;i<=5;i++) {
		//			WebElement scr= driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps you connect and share with the people in your life.')]"));
		//			File from = scr.getScreenshotAs(OutputType.FILE);
		//			File to=new File("C:/Users/elcot/eclipse-workspace/Seleniumrecall/ScreenShot/Gowthamangayee"+"/s"+i +".png");
		//			Files.copy(from, to);	 
		//			}
	}
}
