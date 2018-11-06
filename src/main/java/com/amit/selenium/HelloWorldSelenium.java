package com.amit.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloWorldSelenium {

	private static final Logger log = LogManager.getLogger(HelloWorldSelenium.class.getName());
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseURL = "http://google.com";

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u6039066\\eclipse-workspace\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);
//		WebElement searchBox = driver.findElement(By.xpath("//input[@role='combobox']"));
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Hello World");
		searchBox.submit();
		Thread.sleep(3000);
		driver.quit();	
		LinksText.clickLinks();
		log.debug("This is debug message");
		log.error("This is error message");
		log.fatal("This is error message");
	}

}

//System.setProperty("webdriver.gecko.driver", "C:\\Users\\u6039066\\eclipse-workspace\\libs\\geckodriver.exe");
//WebDriver driver = new FirefoxDriver();
//driver.get(baseURL);

//System.setProperty("webdriver.ie.driver", "C:\\Users\\u6039066\\eclipse-workspace\\libs\\IEDriverServer.exe");
//WebDriver driver = new InternetExplorerDriver();
//driver.get(baseURL);
