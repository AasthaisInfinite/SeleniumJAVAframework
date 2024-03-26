package seleniumFramework;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Pages.Loginpage;
import Pages.Waltscategories;
import Pages.Loginpage;
import Pages.Waltscategories;

public class Test8SearchResult {
    public ExtentReports extent;
    public ExtentSparkReporter reporter;
    public ExtentTest test;
    public WebDriver driver;

    @BeforeTest
    public void setupTest() {
        extent = new ExtentReports();
        reporter = new ExtentSparkReporter("extentreport07.html");
        extent.attachReporter(reporter);
        driver = new ChromeDriver();

        // Create a test
        test = extent.createTest("Cancel button Test", "Verify Cancel button functionality");
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
          	 
			Loginpage.SignInButton(driver).click();
			Thread.sleep(2000);
			test.pass("Sign in button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Sign in button is not clickable");
			Thread.sleep(2000);
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
			test.pass("Waltz categories button is clickable");
			Thread.sleep(2000);
		} catch (Exception e) {
			test.fail("Waltz categories button is not clickable");
			Thread.sleep(2000);
			Assert.fail("Exception occurred while clicking on walts categories button: " + e.getMessage());
 
		}
        Thread.sleep(2000);

        // Search
        String searchQuery = "Test";
        WebElement searchBox = Waltscategories.searchbar(driver);
        
        searchBox.sendKeys(searchQuery);
        searchBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);

        // Find all search result rows
        List<WebElement> searchResultRows = driver.findElements(By.xpath("//tr"));
        Thread.sleep(3000);

        // Initialize a list to store search results containing keywords
        List<String> resultsWithKeywords = new ArrayList<>();

        // Keywords to search for
        String[] keywords = {"Test"};

        // Iterate through each search result row
        for (WebElement row : searchResultRows) {
            // Extract text from the search result row
            String rowText = row.getText();

            // Search for keywords within the row text
            for (String keyword : keywords) {
                if (rowText.contains(keyword)) {
                    // Store the search result row containing the keyword
                    resultsWithKeywords.add(rowText);
                    break; // Break the loop after finding one keyword in the row
                }
            }
        }

        // Print the search results containing keywords
        for (String result : resultsWithKeywords) {
            test.pass(result);
        }
    }

    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
