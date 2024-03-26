package seleniumFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.Loginpage;
import Pages.Waltscategories;
import junit.framework.Assert;
//import org.junit.Assert;
import Pages.Loginpage;
import Pages.Waltscategories;

public class Test6DeleteButton {

	private static WebDriver WebDriver;
	private static WebDriver driver = WebDriver;
	
public static void main(String[] args) throws InterruptedException {
		
				 driver = new ChromeDriver();
		
		driver.get("https://jb-glass-staging.jarvistechnolabs.com/");
		driver.manage().window().maximize(); 
		
		
		
		Thread.sleep(2000);
		Loginpage.Username(driver).sendKeys("user@gmail.com");
		Loginpage.Password(driver).sendKeys("Test@123");
		Loginpage.SignInButton(driver).click();
		Thread.sleep(3000);
		Loginpage.Settings(driver).click();
		Thread.sleep(7000);
		Waltscategories.WaltscategoriesCard(driver).click();
		Thread.sleep(2000);

		Waltscategories.WaltsCategoriesName(driver).sendKeys("HelloTEST");
		
		Thread.sleep(3000);
		
		
		Waltscategories.waltzsubcategory(driver).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/button[1]/*[1]")).click();
		Thread.sleep(3000);
		
		
		Waltscategories.Buttonsavewaltscat(driver).click();
		
		Thread.sleep(2000);
		
		String getmessage = Waltscategories.getmessagealreadyExist(driver).getText();
        Assert.assertEquals("Requested data already exists",getmessage);
        
        System.out.println("Toast message is displayed as Requested data already exists");
        
        Thread.sleep(3000);
        
	

            int totalRowCountBeforeDelete = getTotalRowCount(driver);
            System.out.println("Total number of records across all pages before deletion: " + totalRowCountBeforeDelete);

            Waltscategories.page1(driver).click();
            Thread.sleep(20000);

            
          if (isRecordExists(driver)) {
                // If record exists, delete it
                deleteRecord(driver);
                System.out.println("Record existed and has been deleted.");
            } else {
                // If record doesn't exist, add it
                addRecord(driver);
                System.out.println("Record didn't exist, added successfully.");
            }
            
         

            int totalRowCountAfterDelete = getTotalRowCount(driver);
           System.out.println("Total number of records across all pages after deletion: " + totalRowCountAfterDelete);

           Assert.assertEquals(totalRowCountBeforeDelete - 1, totalRowCountAfterDelete);
            System.out.println("Test passed!");
        } 
    


    private static boolean isRecordExists(org.openqa.selenium.WebDriver driver) throws InterruptedException {
    	
    	Thread.sleep(4000);
    Waltscategories.searchbar(driver).sendKeys("HelloTEST");


      
        
        Thread.sleep(4000);
	return false;
}
    
    
	private static void deleteRecord(org.openqa.selenium.WebDriver driver) throws InterruptedException {
    	
		
	Thread.sleep(4000);
        
        Waltscategories.searchbar(driver).click();
		
        Thread.sleep(4000);
        
        Waltscategories.DeleteButton(driver).click();
    Thread.sleep(4000);

    Waltscategories.getpopupheader(driver).click();
    Thread.sleep(4000);
    
    Waltscategories.yesButton(driver).click();
    Thread.sleep(4000);
	
}


	private static void addRecord(org.openqa.selenium.WebDriver driver) throws InterruptedException {
		
		Waltscategories.WaltsCategoriesName(driver).sendKeys("HelloTEST");
		
		Thread.sleep(3000);
		
		
		Waltscategories.waltzsubcategory(driver).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//body/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body/div[2]/div[1]/button[1]/*[1]")).click();
		Thread.sleep(3000);
		
		
		Waltscategories.Buttonsavewaltscat(driver).click();
		
		Thread.sleep(2000);
	
}


	private static int getTotalRowCount(WebDriver driver) throws InterruptedException {
        int totalRowCount = 0;
        boolean hasNextPage = true;
        Thread.sleep(3000);;

        while (hasNextPage) {
            Thread.sleep(5000);
            
            int currentRowCount = Waltscategories.WebTab(driver).size();
            // Subtracting header row
            totalRowCount += currentRowCount - 1;

            // Check if there is a next page
            hasNextPage = Waltscategories.NextButton(driver).isEnabled();
            Thread.sleep(8000);

            // Scroll down
            ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000);");
            Thread.sleep(8000);

            // If there is a next page, continue to the next page
            if (hasNextPage) {
                Waltscategories.NextButton(driver).click();
            }
        }

        return totalRowCount;
        
        	
        	
        
        		
        				 
      
    }
}
