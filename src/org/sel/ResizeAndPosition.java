package org.sel;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeAndPosition {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thota\\eclipse-workspace\\SeleniumPrac\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//to resize the window
		Dimension d = new Dimension(750,750);
		driver.manage().window().setSize(d);
		
		//to set the position of the window
		Point p = new Point(250,250);
		driver.manage().window().setPosition(p);
	}
}
