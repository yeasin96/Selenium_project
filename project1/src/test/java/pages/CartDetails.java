package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import drivers.PageDriver;
import utilities.CommonMethods;
import utilities.GetScreenShot;

public class CartDetails extends CommonMethods{

ExtentTest test;
	
	public CartDetails(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
	@FindBy(id = "billing_first_name")
	public WebElement fristname;
	@FindBy(id = "billing_last_name")
	public WebElement lastName;
	@FindBy(id = "billing_address_1")
	public WebElement streetaddress;
	@FindBy(id="billing_city")
	WebElement city;
	@FindBy(xpath="//select[@id='billing_state']")
	WebElement select1;
	@FindBy(id="billing_postcode")
	WebElement postcode;
	@FindBy(id="billing_phone")
	WebElement phone;
	@FindBy(id="billing_email")
	WebElement email;
	
	public void fillPersonalInformation() throws IOException {
		
		test.info("Send fristname");
		try {
 			if (fristname.isDisplayed()) {
 				sendText(fristname, firstNameGenerate());
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys fristname successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>fristname location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "fristname");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "fristname.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(fristname.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
//		sendText(fristname, firstNameGenerate());
		
		test.info("Send lastname");
		try {
 			if (lastName.isDisplayed()) {
 				sendText(lastName, lastNameGenerate());
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys lastname successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>lastname location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "lastname");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "lastname.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(lastName.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
//		sendText(lastName, lastNameGenerate());
		
		test.info("Send street address");
		try {
 			if (streetaddress.isDisplayed()) {
 				sendText(streetaddress, "gazipur street-2");
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys street address successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>street address location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "street");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "street.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(streetaddress.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
		
		
//		sendText(streetaddress, "gazipur street-2");
		
		
		
		test.info("Send city address");
		try {
 			if (city.isDisplayed()) {
 				sendText(city, "gazipur city");
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys city address successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>city address location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "city");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "city.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(city.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
//		sendText(city,"gazipur city");
		
		test.info("Send select district");
		try {
 			if (select1.isDisplayed()) {
 				selectItemByVisibleText(select1,"Gazipur");
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys district address successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>district address location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "drstrict");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "district.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(select1.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
//		selectItemByVisibleText(select1,"Gazipur");

		test.info("Send postcode");
		try {
 			if (postcode.isDisplayed()) {
 				sendText(postcode, "1702");
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys postcode address successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>street postcode address location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "postcode");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "postcode.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(postcode.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
		
//		sendText( postcode,"1702");
		
		
		test.info("Send phone");
		try {
 			if (phone.isDisplayed()) {
 				sendText(phone, phoneNumberGenerate());
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys phone successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>street phone location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "phone");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "phone.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(phone.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
		
//		sendText(phone,phoneNumberGenerate());
		
		
		test.info("Send email");
		try {
 			if (email.isDisplayed()) {
 				sendText(email, emailGenerate());
 				test.pass("<p style=\"color:green; font-size:13px\"><b>sendkeys email successfully.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b> email location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "email");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "email.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(email.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
		
//		sendText(email,emailGenerate());
		
		timeOut(3000);
	}
	

}
