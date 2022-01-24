package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thota\\eclipse-workspace\\SeleniumPrac\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("thotatejaswini1993@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.name("pass"));
		txtPassword.sendKeys("aswinia123");
		
		WebElement buttonClick = driver.findElement(By.name("login"));
		buttonClick.click();
		
		//driver.get("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_9efc2c36-ed67-4e94-8af3-8be718b267e5_2_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_2.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
		//WebElement txtElement = driver.findElement(By.tagName("h2"));
		//String text = txtElement.getText();
		//System.out.println(text);
		
				
	}

}
