package seleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertest {
    public static void main(String[] args) throws InterruptedException {
        // Set the path to the location of your ChromeDriver executable
    //    System.setProperty("webdriver.chrome.driver", "path_to_chromedriver.exe");
        
        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the browser and navigate to a website
        driver.get("https://jb-glass-staging.jarvistechnolabs.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
      
        
    }
}
