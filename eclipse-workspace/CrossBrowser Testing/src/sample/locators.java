package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.Test;




public class locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Work\\chromedriver.exe");
		
		//Create Driver Object for Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.youtube.com/");
		
		/* Getting the error message - getText()
		driver.get("https://gmail.com/");
		driver.findElement(By.cssSelector("input#identifierId.whsOnd.zHQkBf")).sendKeys("dsfsdf");
		driver.findElement(By.xpath("//*[@id=\'identifierNext\']/content/span")).click();
		System.out.println(driver.findElement(By.cssSelector("div.dEOOab.RxsGPe")).getText()); */
		
		/* customized xpath 
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Hello");  */
		
		/* customized cssSelector  
		  driver.get("https://www.google.com");
		  driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("Hi");
		 */
		
		
		/* driver.get("http://google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("youtube");
		
		driver.findElement(By.name("q")).click();
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.xpath("//*[@id=\'lst-ib\']")).click();
		
		driver.close(); */
		
		/* driver.get("http://www.qaclickacademy.com/");
		driver.findElement(By.xpath("//li[@class='active']/following-sibling::li[2]")).click(); traverse to sibling
		driver.findElement(By.xpath("//li[@class='active']/parent::ul")).click();  traverse to parent
		*/
		
		/* Static Dropdown  
		driver.get("https://www.walmart.ca/en");
		Select s = new Select(driver.findElement(By.cssSelector("[analytics-data='Department Links']")));
		s.selectByVisibleText("Garage Organization");
		s.selectByIndex(3);
		s.selectByValue("2");
		s.deselectByIndex();  */
		
		/* Dynamic Dropdown */
		driver.get("https://www1.shoppersdrugmart.ca/en/Home");
		//driver.findElement(By.xpath("//*[@id='Header']/div/div[2]/div[3]/nav/div/div/ul/li[2]/button")).click();
		driver.findElement(By.xpath("//*[@id='Header']/div/div[2]/div[3]/nav/div/div/ul/li[3]/div/div/div/div")).click();
	} 
	
}