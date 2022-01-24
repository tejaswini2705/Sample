package org.sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	public static void main(String[] args) {
		//configure the browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\thota\\eclipse-workspace\\SeleniumPrac\\driver\\chromedriver.exe");
		
		//create object for webDriver- interface
		//InterfaceName objecName = new ClassName();
		WebDriver driver = new ChromeDriver();
		
		
		//to launch url
		driver.get("https://www.facebook.com/");
		
		//to maximise the screen
		driver.manage().window().maximize();
		
		//to print the title
		String title = driver.getTitle();
		System.out.println(title);
		
		//to print the url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
		driver.get("https://www.amazon.in/");
		driver.close();
		//driver.get("https://adact.me/");
		
		
		
		
		
		
		
		
	}

}
