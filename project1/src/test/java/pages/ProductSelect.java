package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class ProductSelect extends CommonMethods {
	
//	public ProductSelect() {
//		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
//	}
	
	ExtentTest test;
	
	public ProductSelect(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	
	@FindAll({
		@FindBy(xpath = "//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/div[4]/ul[1]/li[1]/div[1]/div[1]/a[1]/img[1]")
	})
	WebElement hoverelement;
	@FindAll({
		@FindBy(xpath = "//body/div[@id='page']/div[@id='content']/div[1]/div[1]/main[1]/div[4]/ul[1]/li[1]/div[1]/div[2]/div[1]/a[1]")
	})
	WebElement ClickOnCart;
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'Cart')]")
	})
	WebElement AddToCart;
	@FindAll({
		@FindBy(xpath = "//a[contains(text(),'Proceed to checkout')]")
	})
	WebElement Checkout;
	
	public void hovercart() {

		hover(hoverelement);
		timeOut(2000);
	}
	
	public void clickOnaddtocart() throws IOException {
		
		test.info("Click on Cart");
 		try {
 			if (ClickOnCart.isDisplayed()) {
 				ClickOnCart.click();
 				test.pass("<p style=\"color:green; font-size:13px\"><b>Cart Button Clicked.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>cart location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnCart");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnCart.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(ClickOnCart.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
		
//		ClickOnCart.click();
//		timeOut(30000);
	
	public void clickOnaddtocart1() throws IOException {
		
		test.info("Click on AddtoCart");
 		try {
 			if (AddToCart.isDisplayed()) {
 				AddToCart.click();
 				test.pass("<p style=\"color:green; font-size:13px\"><b>addtoCart Button Clicked.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>addtocart location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "ClickOnaddtoCart");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "ClickOnaddtoCart.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(AddToCart.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
//		AddToCart.click();
//		timeOut(30000);
	}
	public void clickOnaddtocart2() throws IOException {
		test.info("Click on checckout");
		try {
 			if (Checkout.isDisplayed()) {
 				Checkout.click();
 				test.pass("<p style=\"color:green; font-size:13px\"><b>Checkedout Button Clicked.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Checkedout location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Checkedout");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Checkedout.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(Checkout.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
//		Checkout.click();
//		timeOut(30000);
	}
}
