package org.sele;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frame {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","H:\\Eclipse Workspace\\grape\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/frame");
		driver.manage().window().minimize();
		
//		String pageSource = driver.getPageSource();
//		System.out.println(pageSource);
		
		List<WebElement> list = driver.findElements(By.tagName("frame"));
		System.out.println(list.size());
		
		 //driver.findElement(By.name("fname")).sendKeys("sdfscdfed");
		
		
		

	}

}
