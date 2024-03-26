package Pages;
 
import java.util.List;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
 
public class Waltscategories {
	public static final WebDriver driver = null;
	public static WebElement element = null;
	private static List <WebElement> element1 = null;


	
	
	public static WebElement WaltscategoriesCard(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[9]/a[1]"));
	return element;	
	}
	
	public static WebElement WaltsCategoriesName(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
	return element;	
	}
	public static WebElement Buttonsavewaltscat(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div/div/form/div[4]/button[1]"));
	return element;	
	}
	public static WebElement waltzsubcategory(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div/div/form/div[2]/div/div[3]"));
	return element;	
	}
	public static WebElement dropdownselect(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body/div[2]/div[2]/ul[1]/li[1]/div[1]/div[1]"));
	return element;	
	}
 
	
	public static WebElement Crossbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body/div[2]/div[1]/button[1]/*[1]"));
	return element;	
	}
	
	public static WebElement CancelButton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[2]"));
	return element;	
	}
	public static WebElement nextbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[2]/svg[1]"));
	return element;	
	}
	public static WebElement selectoption1(WebDriver driver) {
		element = driver.findElement(By.xpath("//body[1]/div[2]/div[2]/ul[1]/li[1]/span[1]"));
		return element;
	}	
	public static WebElement selectoption2(WebDriver driver) {
			element = driver.findElement(By.xpath("//body[1]/div[3]/div[2]/ul[1]/li[2]"));
			return element;
	}
	public static WebElement checkactivestatus(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/div/table/tbody/tr[1]/td[3]/span"));
		return element;
	}	
		public static WebElement checkinactivestatus(WebDriver driver) {
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]"));
			return element;
	}
	public static WebElement validation1(WebDriver driver) {
		element = driver.findElement(By.xpath("//small[contains(text(),'Please enter waltz category')]"));
		return element;
	}
		public static WebElement validation2(WebDriver driver) {
			element = driver.findElement(By.xpath("//small[contains(text(),'Please select waltz sub category')]"));
				return element;
		}
	public static WebElement searchbar(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
			return element;
			}

			public static WebElement getpopupheader(WebDriver driver)
			{
			element = driver.findElement(By.className("p-dialog-title"));
			return element;
			}
			public static WebElement popupcontaindetail(WebDriver driver)
			{
			element = driver.findElement(By.className("p-confirm-dialog-message"));
			return element;
			}
			public static WebElement NoButton(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//*[@id=\"pr_id_2\"]/div[3]/button[1]"));
			return element;
			}
			public static WebElement yesButton(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//*[@id=\"pr_id_2\"]/div[3]/button[2]"));
			return element;
			}
 
			public static WebElement DeleteButton(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/ul[1]/li[2]/img[1]"));
			return element;
			}
			public static WebElement getmessagealreadyExist(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
			return element;
}
 
			public static WebElement webtab(WebDriver driver) {

				element = driver.findElement(By.xpath("//tbody/tr[9]"));
				return element;
			}
			public static WebElement CreateTest(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//*[@id=\"pr_id_2\"]/div[3]/button[2]"));
			return element;
			}
			public static WebElement EditButton(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[2]/div/div/div[2]/div/div/table/tbody/tr[2]/td[5]/ul/li[1]/img"));
			return element;
			}
			public static WebElement Editwaltscategoryfield(WebDriver driver)
			{
			element = driver.findElement(By.name("name"));
			return element;
			}
			public static WebElement Editwaltssubcategoryfield(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
			return element;
			}
			public static WebElement Editwaltscategoryfieldval(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div/div/div/div/div[1]/div/div/form/div[1]/small"));
			return element;
			}
			public static WebElement Editwaltscategoryprefield(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
			return element;
			}
			public static WebElement Buttonclear(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/button[2]"));
			return element;
			}
			public static WebElement gettoastmessage(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//div[contains(text(),'Glass category created successfully.')]"));
			return element;
			}
			public static WebElement getcategoryname(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//div[contains(text(),'Glass category created successfully.')]"));
			return element;
			}
			public static WebElement getinactivestatusradio(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body/div[@id='root']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[2]/div[1]/div[2]"));
			return element;
			}
			public static WebElement categoryidentify(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//td[contains(text(),'eee')]"));
			return element;
			}
			public static WebElement Activestatus(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span[1]"));
			return element;
			}
			public static WebElement updatetoastmessage(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
			return element;
			}
			public static WebElement updatedvalue(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]"));
			return element;
			}
			public static WebElement Getvalue1(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
			return element;
			}
			public static WebElement Getvalue2(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]"));
			return element;
			}
			public static WebElement Getvalue3(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]"));
			return element;
			}
			public static WebElement Getvalue4(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[1]"));
			return element;
			}
			public static WebElement Getvalue5(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[1]"));
			return element;
			}
			public static WebElement Getvalue6(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[1]"));
			return element;
			}
			public static WebElement Getvalue7(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[1]"));
			return element;
			}
			public static WebElement Getvalue8(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[8]/td[1]"));
			return element;
			}
			public static WebElement NextButton(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/button[2]"));
			return element;
			}
			public static WebElement page1(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/span[1]/button[1]"));
			return element;
			}
			public static WebElement getrawCount(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
			return element;
			}
 
			public static List<WebElement> WebTab(WebDriver driver) {
				element1 = driver.findElements(By.xpath("//tr"));
				return element1;
			}
 
			public static WebElement next(WebDriver driver2) {
				// TODO Auto-generated method stub
				return null;
			}
			public static WebElement Searchresult1(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]"));
			return element;	
			}
			public static WebElement log(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
			return element;
			}
			public static WebElement getvalue(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]"));
			return element;	
			}
			public static WebElement deletetoastmessage(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]"));
			return element;	
			}
			public static  List<WebElement> searchresultRow(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]"));
			return element1;	
			}
			public static  WebElement HeaderRow(WebDriver driver)
			{
			element = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/thead[1]/tr[1]"));
			return element;	
			}

 
}