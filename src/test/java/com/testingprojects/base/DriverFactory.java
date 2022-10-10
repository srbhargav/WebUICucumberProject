package com.testingprojects.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {

	static WebDriver driver = null;
	
	// Create a driver instance or returns existing driver

	public static WebDriver get_driver_instance() {

		if (driver == null) {
			System.out.println("Creating driver");
			System.setProperty("webdriver.chrome.driver", "../WebUICucumberProject/drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized"); // open Browser in maximized mode
			driver = new ChromeDriver(options);
		}

		return driver;
	}
}
