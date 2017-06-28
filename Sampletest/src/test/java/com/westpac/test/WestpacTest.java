package com.westpac.test;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.westpac.utils.ReadObjectFile;

public class WestpacTest {
	private WebDriver driver;
	private String baseUrl;
	Logger logger = Logger.getLogger(WestpacTest.class.getName());
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty(ReadObjectFile.Handle_configfile("drivertypesetvalue"),
		ReadObjectFile.Handle_configfile("driverlocation"));
		ChromeOptions options = new ChromeOptions();
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.addArguments("chrome.switches", "--disable-extensions");
		// options.addArguments("-incognito");
		options.addArguments("--disable-infobars");
		driver = new ChromeDriver();
		logger.info("Driver used is:"+driver);
		baseUrl = ReadObjectFile.Handle_configfile("url");
		logger.info("Base url used is:"+baseUrl);
		driver.manage().window().maximize();

	}

	@Test
	public void testWestPacScenarios() throws Exception {
		driver.get(baseUrl);
		// Prerequisite of application navigation to the user story 1/2
		Actions action = new Actions(driver);
		WebElement kiwisavermouseover = driver.findElement(By.id(ReadObjectFile.Handle_configfile("kiwisaver")));
		action.moveToElement(kiwisavermouseover).build().perform();
		logger.info("Mouse over on kiwisaver:"+kiwisavermouseover);
		driver.findElement(By.id(ReadObjectFile.Handle_configfile("kiwisavercalculator"))).click();

		WebElement clickonkiwisavercalculator = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.presenceOfElementLocated(By.linkText(ReadObjectFile.Handle_configfile("clickonkiwisavercalculator"))));
		Actions actions = new Actions(driver);
		logger.info("Clicked on"+clickonkiwisavercalculator);
		actions.moveToElement(clickonkiwisavercalculator);
		actions.click().perform();

		// Test user story1 automation script Starts
		logger.info("---------User Story1 Automation Script Starts----------");
		WebElement calculatoriframe = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.presenceOfElementLocated(By.xpath(ReadObjectFile.Handle_configfile("calculatoriframe"))));
		driver.switchTo().frame(calculatoriframe);
		logger.info("Swithced iframe :"+calculatoriframe);
		Thread.sleep(3000);
		WebElement currentageinfoicon = (new WebDriverWait(driver, 10)).until(ExpectedConditions
				.elementToBeClickable(By.xpath(ReadObjectFile.Handle_configfile("currentageinfoicon"))));
		currentageinfoicon.click();
		logger.info("Clicked on current age info icon"+currentageinfoicon);
		assertEquals(driver.findElement(By.cssSelector(ReadObjectFile.Handle_configfile("currentinfoiconmessage")))
				.getText(), ReadObjectFile.Handle_configfile("expectedinfoiconmessage"));
		logger.info("Verified current age info icon value");
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("clickcurrentageinfobutton"))).click();
		logger.info("---------User Story1 Automation Script Ends----------");
		// Test user story1 automation script Ends
		/*
		 * Test User Story2 Automation Script Starts First Scenario of Test User
		 * Story 2
		 */
		logger.info("---------User Story2 Automation Script Starts----------");
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("currentagetextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("currentagetextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("currentagetextboxvalueemployed"));
		logger.info("Enter value in current age:"+ReadObjectFile.Handle_configfile("currentagetextboxvalueemployed"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("clickonemploymentstatusdropdown"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectemployed"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("salaryperyeartextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("salaryperyeartextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("salaryperyeartextboxvalue"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectkiwisavermembercontributionforemployed")))
				.click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectpirdropdown"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectpirvalueforemployed"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectriskprofileashigh"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("clickonsumbitbuttontoseekiwiretirementprojects")))
				.click();
		assertEquals(
				driver.findElement(By.cssSelector(ReadObjectFile.Handle_configfile("actualclaculatorprojectiontext")))
						.getText(),
				ReadObjectFile.Handle_configfile("expectedclaculatorprojectiontext"));
		assertEquals(driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("actualclaculatorprojectionvalue")))
				.getText(), ReadObjectFile.Handle_configfile("expectedclaculatorprojectionvalueforemployed"));
		logger.info("Verified calculated projection retirement plan:"+ReadObjectFile.Handle_configfile("expectedclaculatorprojectionvalueforemployed"));
		// Second Scenario of Test User Story 2
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("currentagetextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("currentagetextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("currentagetextboxvalueselfemployed"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("clickonemploymentstatusdropdown"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectselfemployed"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectpirdropdownforselfemployed"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("pirvalue"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("salaryperyeartextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("salaryperyeartextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("currentkiwisaverbalanceforselfemployed"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("valuntarycontributiontextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("valuntarycontributiontextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("valuntarycontributionforselfemployedtextboxvalue"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("frequencydropdown"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectfrequencyfortnight"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectriskprofileasmedium"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("savingsgoaltextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("savingsgoaltextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("savingsgoaltextboxvalueforselfemployed"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("frequencydropdown"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectfrequencyfortnight"))).click();
		assertEquals(
				driver.findElement(By.cssSelector(ReadObjectFile.Handle_configfile("actualclaculatorprojectiontext")))
						.getText(),
				ReadObjectFile.Handle_configfile("expectedclaculatorprojectiontext"));
		assertEquals(
				driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("actualclaculatorprojectionvalue")))
						.getText(),
				ReadObjectFile.Handle_configfile("expectedclaculatorprojectionvalueforselfemployed"));
		logger.info("Verified calculated projection retirement plan:"+ReadObjectFile.Handle_configfile("expectedclaculatorprojectionvalueforselfemployed"));
		// Third Scenario of Test User Story 2
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("currentagetextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("currentagetextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("currentagetextboxvaluenotemployed"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("clickonemploymentstatusdropdown"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectnotemployed"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectpirdropdownforselfemployed"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("pirvalue"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("salaryperyeartextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("salaryperyeartextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("currentkiwisaverbalancefornotemployed"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("valuntarycontributiontextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("valuntarycontributiontextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("valuntarycontributionfornotemployedtextboxvalue"));
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("frequencydropdown"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectfrequencyforannual"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("selectriskprofileasmedium"))).click();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("savingsgoaltextbox"))).clear();
		driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("savingsgoaltextbox")))
				.sendKeys(ReadObjectFile.Handle_configfile("savingsgoaltextboxvaluefornotemployed"));
		assertEquals(
				driver.findElement(By.cssSelector(ReadObjectFile.Handle_configfile("actualclaculatorprojectiontext")))
						.getText(),
				ReadObjectFile.Handle_configfile("expectedclaculatorprojectiontext"));
		assertEquals(
				driver.findElement(By.xpath(ReadObjectFile.Handle_configfile("actualclaculatorprojectionvalue")))
						.getText(),
				ReadObjectFile.Handle_configfile("expectedclaculatorprojectionvaluefornotemployed"));
		logger.info("Verified calculated projection retirement plan:"+ReadObjectFile.Handle_configfile("expectedclaculatorprojectionvaluefornotemployed"));
		logger.info("---------User Story2 Automation Script Ends----------");
		// Test user story2 automation script Ends

	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();

	}

}
