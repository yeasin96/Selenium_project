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

public class HomePage extends CommonMethods{
	
	ExtentTest test;
	
	public HomePage(ExtentTest test) {
		PageFactory.initElements(PageDriver.getCurrentDriver(), this);
		this.test = test;
	}
    @FindAll({

		@FindBy(xpath = "//header/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")
	})
	WebElement catagory;
	
	@FindAll({
		@FindBy(xpath = "//body/div[@id='page']/div[@id='content']/article[@id='post-29246']/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[37]/a[1]/h2[1]")
	})
	WebElement catselect;
	
	
     public void clickOncatagory() throws IOException {
    	 test.info("Click on Catagory");
 		try {
 			if (catagory.isDisplayed()) {
 				catagory.click();
 				test.pass("<p style=\"color:green; font-size:13px\"><b>Catagory Button Clicked.</b></p>");
 				timeOut();
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Catagory location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "catagoryButton");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "catagoryButton.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(catagory.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}
     
	 public void scroll() {
		 scrollPageDown();
		 timeOut(3000);
	 }
	 public void clickOncatselect() throws IOException {
    	 test.info("Click on CatagorySelect");
 		try {
 			if (catselect.isDisplayed()) {
 				catselect.click();
 				test.pass("<p style=\"color:green; font-size:13px\"><b>Catagory Select Button Clicked.</b></p>");
 				timeOut(2000);
 			}
		
 		}
 		catch (Exception e) {
			test.fail("<p style=\"color:red; font-size:13px\"><b>Catagory Select location not avialble.</b></p>");
			Throwable t = new InterruptedException("Exception");
			test.fail(t);
			@SuppressWarnings("unused")
			String screenShotPath = GetScreenShot.capture(PageDriver.getCurrentDriver(), "Cataslect");
			String dest = System.getProperty("user.dir") + "\\screenshots\\" + "Cataslect.png";
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(dest).build());
			Assert.assertTrue(catselect.isDisplayed());
			PageDriver.getCurrentDriver().quit();
		}
	}

	
}
