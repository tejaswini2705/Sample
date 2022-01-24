package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverActions {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thota\\eclipse-workspace\\SeleniumPrac\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement courseElement = driver.findElement(By.xpath("//a[text()='COURSES']"));
		
		Actions a = new Actions(driver);
		a.moveToElement(courseElement).perform();
		Thread.sleep(3000);
		
		WebElement oracleElement = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		
		Actions a11 = new Actions(driver);
		a11.moveToElement(oracleElement).perform();
		
		Thread.sleep(3000);
		
		WebElement sqlElement = driver.findElement(By.xpath("//span[text()='SQL Certification']"));
		
		Actions a21 = new Actions(driver);
		a21.moveToElement(sqlElement).perform();
		
		driver.quit();
		
		
		
	}

}
