package com.prasanna.dm;

import java.sql.Driver;
import java.util.List;
import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.File;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SelectFlight extends TicketBooking {

	
	
	public static void select() throws Exception
	{
		// Outflight
		 File filepath = new File("C:/Users/501316/workspace/Project_demoaut/radio.xls");
		 Workbook wb = Workbook.getWorkbook(filepath);
	     Sheet sh1 = wb.getSheet(2);
		List<WebElement> outflight = driver.findElements(By.name("outFlight"));
		int outflsiz = outflight.size();
		String actualoutflight = sh1.getCell(0,1).getContents();
		System.out.println(sh1.getCell(0,1).getContents());
		
		for (int n=0; n<=outflsiz-1; n++)
		{
			if(actualoutflight.equalsIgnoreCase(outflight.get(n).getAttribute("value")))
			{
				outflight.get(n).click();
			}
		}
		// Outflight
		// Inflight
		List<WebElement> inflight = driver.findElements(By.name("inFlight"));
		int inflsiz = inflight.size();
		String actualinflight = sh1.getCell(1,1).getContents();
		System.out.println(sh1.getCell(1,1).getContents());
		
		for (int m=0; m<=inflsiz-1; m++)
		{
			if(actualinflight.equalsIgnoreCase(inflight.get(m).getAttribute("value")))
			{
				outflight.get(m).click();
			}
		}
		// Inflight

		driver.findElement(By.name("reserveFlights")).click();;
	}
		
	
}
