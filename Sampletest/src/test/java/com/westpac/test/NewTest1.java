package com.westpac.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void food1() {
	  String baseUrl;
	  System.setProperty("webdriver.chrome.driver", "D:/chromedriver/chromedriver.exe");  
	  WebDriver driver = new ChromeDriver();
	  baseUrl = "http://www.westpac.co.nz";
	  driver.get(baseUrl + "/");
  }
}
