package com.pack;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandling {

	
	public static void main(String[] args) throws InterruptedException   {
		
		System.out.println("first");
		System.out.println("second");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
        ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver=new ChromeDriver(options);
		
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//span[@class='allcircle circleone']")).click();
		
		driver.findElement(By.xpath("//span[@class='allcircle circletwo']")).click();
		
		driver.findElement(By.xpath("//span[@class='railDrishti fa fa-line-chart']")).click();
		
		driver.findElement(By.xpath("//label[normalize-space()='HOLIDAY PACKAGES']")).click();
		
		driver.findElement(By.xpath("//span[@class='allcircle circleseven']")).click();
		
		
    	
		
		
		String windowhandle=driver.getWindowHandle();
		
		System.out.println("windowhandle"+driver.getTitle()+windowhandle);
		
		Set<String> windowhandles=driver.getWindowHandles();
		
		
		System.out.println("windowhandles"+driver.getTitle()+windowhandles);
		
		 List<String> tab=new ArrayList<String> (windowhandles);
		 driver.switchTo().window(tab.get(0));
		 System.out.println("windowhandles"+driver.getTitle()+windowhandles+driver.getCurrentUrl());
			
		 driver.switchTo().window(tab.get(1));
		 System.out.println("windowhandles"+driver.getTitle()+windowhandles+driver.getCurrentUrl());
			
		 driver.switchTo().window(tab.get(2));
		 System.out.println("windowhandles"+driver.getTitle()+windowhandles+driver.getCurrentUrl());
			
		 driver.switchTo().window(tab.get(3));
		 System.out.println("windowhandles"+driver.getTitle()+windowhandles+driver.getCurrentUrl());
			
		 driver.switchTo().window(tab.get(4));
		 System.out.println("windowhandles"+driver.getTitle()+windowhandles+driver.getCurrentUrl());
			
		 driver.switchTo().window(tab.get(5));
		 System.out.println("windowhandles"+driver.getTitle()+windowhandles+driver.getCurrentUrl());
		 
		 
		 driver.switchTo().window(tab.get(3));
		 System.out.println("windowhandles"+driver.getTitle()+windowhandles+driver.getCurrentUrl());
	
		 
		Thread.sleep(1000);
		 driver.quit();
	

}
}
