package seleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.Waltscategories;
import Pages.Loginpage;
import Pages.Waltscategories;

public class Test3ValidateInActivestatus {
    public ExtentReports extent;
    public ExtentSparkReporter reporter;
    public ExtentTest test;
    public WebDriver driver;

    @BeforeTest
    public void setupTest() {
    	
        extent = new ExtentReports();
        reporter = new ExtentSparkReporter("extentreport03.html");
        extent.attachReporter(reporter);
       
       

        driver = new ChromeDriver();

       
        
        // Create a test
        test = extent.createTest("Inactivate Status Test", "Verify inactivate status functionality");
    }

    @Test
    public void searchAndPrintResults() throws InterruptedException {
        test.log(Status.INFO, "Navigating to the website");
        driver.get("https://jb-glass-staging.jarvistechnolabs.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        try {
	       	 
			Loginpage.Username(driver).sendKeys("user@gmail.com");
			Thread.sleep(2000);
			test.pass("Email ID entered successfully");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Email is not entered");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while entering email: " + e.getMessage());
 
		}
        try {
       	 
        	Loginpage.Password(driver).sendKeys("Test@123");
			Thread.sleep(2000);
			test.pass("Password is entered succussfully");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Password is not entered");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while entering password: " + e.getMessage());
 
		}
        
        try {
            // Wait for the ButtonSignIN to be clickable
         

            Loginpage.SignInButton(driver).click();
            Thread.sleep(4000);
            test.pass("Sign in button is clickable");
            Thread.sleep(2000);
        } catch (Exception e) {
            test.fail("Sign in button is not clickable");
            Thread.sleep(3000);
            Assert.fail("Exception occurred while clicking on Sign in button: " + e.getMessage());
        }
        try {
         	 
			Loginpage.Settings(driver).click();
			Thread.sleep(2000);
			test.pass("Setting button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Setting button is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on settings button: " + e.getMessage());
 
		}
        try {
        	 
			Waltscategories.WaltscategoriesCard(driver).click();
			Thread.sleep(2000);
			test.pass("walts categories button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("walts categories button is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on walts categories button: " + e.getMessage());
 
		}
        try {
       	 
			Waltscategories.WaltsCategoriesName(driver).sendKeys("Thirteenthousand");
			Thread.sleep(2000);
			test.pass("walts category name is entered");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("walts categories button is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while entering walts category name: " + e.getMessage());
 
		}
        try {
          	 
        	Waltscategories.waltzsubcategory(driver).click();
			Thread.sleep(2000);
			test.pass("walts sub category dropdown is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("walts sub category dropdown is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on walts sub category dropdown: " + e.getMessage());
 
		}
        try {
         	 
        	Waltscategories.dropdownselect(driver).click();
			Thread.sleep(2000);
			test.pass("Option1 is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Option1 is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on option1: " + e.getMessage());
 
		}
        
        try {
        	 
        	Waltscategories.Crossbutton(driver).click();
			Thread.sleep(2000);
			test.pass("Cross button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Cross button is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on cross button: " + e.getMessage());
 
		}
    
    
    
    //driver.findElement(By.xpath("//body/div[2]/div[1]/button[1]/*[1]")).click();
  //  Thread.sleep(2000);
        
        try {
       	 
        	Waltscategories.getinactivestatusradio(driver).click();
			Thread.sleep(2000);
			test.pass("In Active radio button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("In Active radio button is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on In Active button: " + e.getMessage());
 
		}
   
        try {
          	 
        	Waltscategories.Buttonsavewaltscat(driver).click();
			Thread.sleep(2000);
			test.pass("Save Waltz Category button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Save Waltz Category button is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on Save Waltz Category button: " + e.getMessage());
 
		}
       
    
    Thread.sleep(2000);

        // Assertion and logging to Extent Report
        try {
            String getinactivestatus = Waltscategories.checkinactivestatus(driver).getText();
            Assert.assertEquals("Inactive", getinactivestatus);
            test.log(Status.PASS, "Test Passed as status is displayed Inactive");
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Test Failed: " + e.getMessage());
            throw e;
        }
    }

    @AfterTest
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
        // Flush the Extent Reports
        if (extent != null) {
            extent.flush();
        }
    }
}
