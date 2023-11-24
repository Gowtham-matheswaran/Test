package com.org.reuse;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewClass {

	public static WebDriver driver;

	public static void windowHandle() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();	
		for(String base:child) {
			if(!base.equals(parent)) {
				driver.switchTo().window(base);
			}
		}
	}
		public static void clickGo(WebElement web) {
			web.click();
		}
	}
