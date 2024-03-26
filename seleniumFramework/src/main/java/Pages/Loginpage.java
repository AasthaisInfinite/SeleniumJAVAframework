package Pages;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class Loginpage {
	public static final WebDriver driver = null;
	public static WebElement element = null;
	private static List <WebElement> element1 = null;
	
	
	public static WebElement Username(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
	return element;	
	}
	public static WebElement Password(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/input[1]"));
	return element;	
	}
	public static WebElement SignInButton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]"));
	return element;	
	}
	public static WebElement Settings(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/nav[1]/ul[1]/li[6]/span[1]/i[1]"));
	return element;	
	}

}
 
