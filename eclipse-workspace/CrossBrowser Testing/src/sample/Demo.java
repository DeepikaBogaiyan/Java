package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//invoke .exe file
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium Work\\chromedriver.exe");
		
		//Create Driver Object for Chrome Browser
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com"); //Hit URL on the browser
		
		System.out.println(driver.getTitle()); //Get page title
		
		System.out.println(driver.getCurrentUrl()); //Get current url 
		
		//System.out.println(driver.getPageSource()); //Get Page Source
		
		driver.get("http://yahoo.com");
		
		driver.navigate().back();//navigate back to google
		
		driver.navigate().forward();//Navigate forward
		
		driver.close();//close current window opened by selenium
		
		driver.quit();//closes all the window opened by selenium
	}

}
