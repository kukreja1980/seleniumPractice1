package com.amit.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksText {

	public static void clickLinks () {
		// TODO Auto-generated method stub

		String baseURL= "http://google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u6039066\\eclipse-workspace\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseURL);
		driver.close();
		
		
	}

}
