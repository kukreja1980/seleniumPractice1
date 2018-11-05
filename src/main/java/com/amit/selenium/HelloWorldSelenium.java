package com.amit.selenium;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorldSelenium {

	private static final Logger log = LogManager.getLogger(HelloWorldSelenium.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseURL = "http://google.com";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\u6039066\\eclipse-workspace\\libs\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(baseURL);
		log.debug("This is debug message");
		log.error("This is error message");
		log.fatal("This is error message");
		driver.close();		
	}

}
