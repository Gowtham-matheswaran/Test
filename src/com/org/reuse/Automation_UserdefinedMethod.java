package com.org.reuse;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class Automation_UserdefinedMethod {

	public static WebDriver driver;
	public static WebDriverWait waits;

	//0.ExplicitWaits
	public static void explicit() {
		waits=new WebDriverWait(driver,Duration.ofSeconds(35));
	}

	// 1.ClickBtn
	public static void clickGo(WebElement web) {
		web.click();
	}

	//2.VisibilityofElement
	public static void elementClick(WebElement web) {
		WebElement until = waits.until(ExpectedConditions.elementToBeClickable(web)); //UsingwaitsClick
		until.click();
	}

	//3.ScreenShot
	public static void screenShotClick() throws IOException{
		TakesScreenshot shot=(TakesScreenshot)driver;
		File from = shot.getScreenshotAs(OutputType.FILE);
		File to = new File("C:/Users/elcot/eclipse-workspace/Seleniumrecall/ScreenShot/Gowtham.png");
		Files.copy(from, to);
	}

	//4.MouseOverAction
	public static void mouseAction(WebElement web) {
		Actions act=new Actions(driver);
		act.moveToElement(web).build().perform();	
	}

	//5.SendKeys
	public static void sendValue(WebElement web, String str){
		WebElement until = waits.until(ExpectedConditions.visibilityOf(web));	//UsingwaitsValueSend
		until.sendKeys(str);
	}

	//6.ImplecitlyWait
	public static void implecitly() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35));
	}

	//7.AlertWait
	public static void alerts() {
		Alert until = waits.until(ExpectedConditions.alertIsPresent());
		until.accept();
	}

	//8.MultipleClick(Advance)
	public static void multipleClick(List<WebElement> web) {
		for(WebElement clk:web) {
			clk.click();
		}
	}

	//9.MultipleClick(Normal)
	public static void multiClk(List<WebElement> web) {
		for(int i=0;i<web.size();i++) {
			web.get(i).click();
		}
	}

	//10.WindowHandling
	public static void windowHandle() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();	
		for(String base:child) {
			if(!base.equals(parent)) {
				driver.switchTo().window(base);
			}
		}

	//11.GetText





	}
}













