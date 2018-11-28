package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testCase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		//FireFox gecko Driver
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Selenium Work\\geckodriver.exe");
		
		
		//Create Driver Object for Internet Explorer Browser
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}