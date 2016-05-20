package com.prasanna.dm;

import java.io.File;
import java.io.IOException;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.File;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;


public class Reviewpage extends Base {

	public static void verify() throws BiffException, IOException
	{
		File fp = new File("C:/Users/501316/workspace/Project_demoaut/radio.xls");
		Workbook wb = Workbook.getWorkbook(fp);
		Sheet sh2 = wb.getSheet(3);
		String actualFName = sh2.getCell(0,1).getContents();
		String actualSName = sh2.getCell(1,1).getContents();
		String actualNumber = sh2.getCell(4,1).getContents();
		driver.findElement(By.name("passFirst0")).sendKeys(actualFName);
		driver.findElement(By.name("passLast0")).sendKeys(actualSName);
		driver.findElement(By.name("creditnumber")).sendKeys(actualNumber);
		driver.findElement(By.name("buyFlights")).click();
		
	}
}
