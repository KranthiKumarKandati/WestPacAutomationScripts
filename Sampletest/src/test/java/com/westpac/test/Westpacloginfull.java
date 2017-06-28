package com.westpac.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Westpacloginfull {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();



  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	 // WebDriver driver;
	  System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");  
	  driver = new ChromeDriver();
    baseUrl = "http://www.westpac.co.nz/";
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testWestpacloginfull() throws Exception {
	  driver.get(baseUrl + "/");
    driver.findElement(By.linkText("Click here to get started.")).click();
    driver.findElement(By.linkText("Click here to get started.")).click();
    try {
      assertEquals(driver.getTitle(), "KiwiSaver Retirement Calculator - Westpac NZ");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//button[@type='button']")).getText(), "View help for this field");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//div/button/i)[1]")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("p")).getText(), "This calculator has an age limit of 64 years old as you need to be under the age of 65 to join KiwiSaver.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("//*[@id='widget']/div/div[1]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/button/i")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(//button[@type='button'])[2]")).getText(), "View help for this field");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div[2]/div/p")).getText(), "If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(//button[@type='button'])[3]")).getText(), "View help for this field");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div[2]/div/p")).getText(), "This is your prescribed investor rate (PIR) for tax purposes. If you don't know what your PIR is, click on the ‘Find My Rate’ button.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(//button[@type='button'])[7]")).getText(), "View help for this field");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[5]/div/div/div/div[2]/div/div[2]/div/p")).getText(), "If you do not have a KiwiSaver account, then leave this field blank.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(//button[@type='button'])[8]")).getText(), "View help for this field");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[6]/div/div/div/div[2]/div/div[2]/div/p")).getText(), "If you are 'Self-Employed' or 'Not employed', you can make direct contributions to your KiwiSaver account. If you are 'Employed', you can make voluntary contributions in addition to your regular employee contributions.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(//button[@type='button'])[9]")).getText(), "View help for this field");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[7]/div/div/div/div[2]/div/div[2]/div/ul/li")).getText(), "Low risk investments usually contain mostly income assets. Generally, investments of this nature can be expected to deliver modest but more consistent returns. They are less likely to go up and down, but will usually provide lower returns over the long term.");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[9]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("(//button[@type='button'])[10]")).getText(), "View help for this field");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[8]/div/div/div/div[2]/div/div[2]/div/p")).getText(), "Enter the amount you would like to have saved when you reach your intended retirement age. If you aren’t sure what this amount is, you can leave it blank or use the Sorted Retirement Planner");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.xpath("(//button[@type='button'])[10]")).click();
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).clear();
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).sendKeys("30");
    driver.findElement(By.cssSelector("div.well-value.ng-binding")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/ul/li[2]/div")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("82000");
    driver.findElement(By.id("radio-option-06E")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[5]/div/div/div/div[2]/div/div/div/div/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[5]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/ul/div[2]/li/div")).click();
    driver.findElement(By.id("radio-option-021")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div[2]/button")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("span.result-title.ng-binding")).getText(), "At age 65, your KiwiSaver balance is estimated to be:");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div[3]/div/div/div/div/span[2]")).getText(), "$313,971");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("rect..highcharts-background")).getText(), "");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).clear();
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).sendKeys("40");
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).clear();
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).sendKeys("45");
    driver.findElement(By.cssSelector("div.well-value.ng-binding")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/ul/li[2]/div/span")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/ul/div/li/div")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("100000");
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("90");
    driver.findElement(By.id("radio-option-01Y")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("290000");
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[6]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[6]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/ul/li[4]/div")).click();
    try {
      assertEquals(driver.findElement(By.cssSelector("span.result-title.ng-binding")).getText(), "At age 65, your KiwiSaver balance is estimated to be:");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div[3]/div/div/div/div/span[2]")).getText(), "$230,481");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("rect..highcharts-background")).getText(), "");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).clear();
    driver.findElement(By.cssSelector("input.ng-valid.ng-dirty")).sendKeys("55");
    driver.findElement(By.cssSelector("div.well-value.ng-binding")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[2]/div/div/div/div[2]/div/div/div/div/div/div[2]/ul/li[3]/div/span")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[3]/div/div/div/div[2]/div/div/div/div/div/div/div[2]/ul/div/li/div")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("140000");
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("10");
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[6]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div/div")).click();
    driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div/div/div[6]/div/div/div/div[2]/div/div/div/div/div/div[2]/div/div[2]/ul/li[6]/div/span")).click();
    driver.findElement(By.id("radio-option-01Y")).click();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("200000");
    try {
      assertEquals(driver.findElement(By.cssSelector("span.result-title.ng-binding")).getText(), "At age 65, your KiwiSaver balance is estimated to be:");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.xpath("//div[@id='widget']/div/div/div/div[3]/div/div/div/div/span[2]")).getText(), "$176,557");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    try {
      assertEquals(driver.findElement(By.cssSelector("rect..highcharts-background")).getText(), "");
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}

