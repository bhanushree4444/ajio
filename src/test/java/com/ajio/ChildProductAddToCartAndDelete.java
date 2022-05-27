package com.ajio;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildProductAddToCartAndDelete {

	public static void main(String[] args) throws InterruptedException, IOException {
WebDriverManager.chromedriver().setup();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		//driver
		driver.get("https://www.ajio.com/");
		Thread.sleep(8000);
		driver.findElement(By.xpath("//a[@title='KIDS']")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//a[@href='/s/starting-at-rs-199-4691-77081']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[.='price' and @class='facet-left-pane-label']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Rs.500-1000']")).click();
		Thread.sleep(4000);
//		driver.findElement(By.xpath("//span[.='brands']")).click();
//		driver.findElement(By.xpath("//label[@for='AARIKA GIRLS ETHNIC']")).click();
//		Thread.sleep(4000);
//		//driver.findElement(By.xpath("//span[.='brands']")).click();
//		driver.findElement(By.xpath("//label[@for='612 League']")).click();
//		Thread.sleep(4000);
//		//driver.findElement(By.xpath("//span[.='brands']")).click();
//		
//		WebElement emnt1 = driver.findElement(By.xpath("//label[@for='Bitiya By Bhama']"));
//		
//		driver.findElement(By.xpath("//div[@class='nameCls' and .='Embellished Kurta with Bottomwear']")).click();
//		Set<String> allid = driver.getWindowHandles();
//		for(String id:allid) 
//		{
//			driver.switchTo().window(id);
//			if(driver.getTitle().contains("bitiya-by-bhama-embellished-kurta-with-bottomwear")) {
//				break;
//			}
//		}
//		
//		driver.findElement(By.xpath("//span[.='3-4Y']")).click();
//		driver.findElement(By.xpath("//span[.='ADD TO BAG']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//div[@class='ic-cart ']")).click();
//		Thread.sleep(4000);
//		//verification
//		WebElement ele2 = driver.findElement(By.xpath("//div[@class='product-name']/a/span"));
//		if(ele2.getText().contains("Bitiya By Bhama")) {
//			System.out.println("right product added");
//		}
//		driver.findElement(By.xpath("//div[.='Delete' and @class='delete-btn']")).click();
//		//Alert a = driver.switchTo().alert();
//	   // a.accept();
//		
	}

}
