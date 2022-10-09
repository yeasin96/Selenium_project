package tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import drivers.BaseDriver;
import drivers.PageDriver;
import pages.CartDetails;
import pages.HomePage;
import pages.ProductSelect;
import utilities.ExtentFactory;

public class Chechoutbook extends BaseDriver{
	
	ExtentReports report;
	ExtentTest parentTest;
	ExtentTest childTest;
	
	@BeforeClass
	public void startUrl() {
		report = ExtentFactory.getInstance();
		parentTest = report.createTest("<p style=\"color:DarkBlue; font-size:20px\"><b>Checkout details check</b></p>")
				.assignAuthor("QA TEAM").assignDevice("Windows");
		PageDriver.getCurrentDriver().get(baseURL);
		PageDriver.getCurrentDriver().manage().window().maximize();
	}
	
	
	@Test (priority=0)
	public void Homepage() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Until Click On Catagory.</b></p>");
		HomePage homePage = new HomePage(childTest);
		homePage.clickOncatagory();
		homePage.scroll();
		homePage.clickOncatselect();
		
	}
	
	@Test (priority=1)
	public void AddToCart() throws IOException {
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On AddToCart.</b></p>");
		ProductSelect PPage = new ProductSelect(childTest);
		PPage.hovercart();
		PPage.clickOnaddtocart();
		PPage.clickOnaddtocart1();
		PPage.clickOnaddtocart2();
	
	
	}
	
	
	@Test (priority=2)
	public void Information() throws IOException	{
		childTest = parentTest
				.createNode("<p style=\"color:DarkBlue; font-size:20px\"><b>Click On CheckOutDetails.</b></p>");
		CartDetails cPage = new CartDetails(childTest);
		
		
		
	cPage.fillPersonalInformation();
}
	
	@AfterClass
	public void afterClass() {
		report.flush();
	}
	
}
