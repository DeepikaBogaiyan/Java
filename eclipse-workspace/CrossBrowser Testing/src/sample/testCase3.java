package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class testCase3 {
	
	public static void main(String[] args) {
		
		//Internet Explorer Browser
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Selenium Work\\MicrosoftWebDriver.exe");
		
		//Create Driver Object for Internet Explorer Browser
		WebDriver driver=new InternetExplorerDriver();
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}

}