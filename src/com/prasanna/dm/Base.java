package com.prasanna.dm;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import jxl.JXLException;
import jxl.Sheet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	 static WebDriver driver;
	 


	public static void start() throws InterruptedException {

			
		String  exePath = "C:\\Users\\501316\\Downloads\\chromedriver_win32\\chromedriver.exe";
	      System.setProperty("webdriver.chrome.driver", exePath);
			 driver = new ChromeDriver();
		
	}
	public static void launch(Sheet sh) throws Exception 
	{
	System.out.println("started launch");	
	driver.get("http://newtours.demoaut.com/");
	driver.findElement(By.name("userName")).sendKeys(sh.getCell(0,0).getContents());
	driver.findElement(By.name("password")).sendKeys(sh.getCell(1,0).getContents());
	driver.findElement(By.name("login")).click();
//	TicketBooking.booking1();
//	System.out.println("End launch");
//	Thread.sleep(5000);
//	driver.close();
	// TicketBooking  ticketBooking = new TicketBooking();
	 //ticketBooking.booking1();
	
	}
	
}
