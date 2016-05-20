package com.prasanna.dm;

import java.util.List;
import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
//import jxl.read.biff.File;
import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TicketBooking extends Base {

	public static void booking1() throws Exception{
		
		 File path = new File("C:/Users/501316/workspace/Project_demoaut/radio.xls");
		Workbook workbook = Workbook.getWorkbook(path);
		 Sheet sh = workbook.getSheet(1);
		 
		 // TYPE
		List<WebElement> type = driver.findElements(By.name("tripType")); // get all the values and store it in type
		int listlength = type.size();  // find the size of type(total number of radio values)
//		System.out.println(listlength);
//		System.out.println(actualTypeValue);
//		System.out.println(type.get(0).getAttribute("value"));
		String actualTypeValue = sh.getCell(0,1).getContents(); 
//		System.out.println(actualTypeValue);
		for (int i=0; i <= listlength-1; i++)
		{
			
			//System.out.println(type.get(i).getAttribute("value"));
			if(actualTypeValue.equalsIgnoreCase(type.get(i).getAttribute("value")))
			{
				
			    type.get(i).click();
				break;
			}
		}
		// TYPE
		
		
		//PASSENGERS
		Select passengers = new Select(driver.findElement(By.name("passCount")));
		String actualPassengervalue = sh.getCell(1,1).getContents();
		passengers.selectByValue(actualPassengervalue);
		//PASSENGERS

		//Departing
		Select departing = new Select(driver.findElement(By.name("fromPort")));
		String actualdepartingvalue = sh.getCell(2,1).getContents();
		departing.selectByValue(actualdepartingvalue);
		//Departing
	
		
		//Arrival
		Select arrival = new Select(driver.findElement(By.name("toPort")));
		String actualarrivalvalue = sh.getCell(3,1).getContents();
		arrival.selectByValue(actualarrivalvalue);
		//Arrival
		
		//Service Class
		List<WebElement> serclass = driver.findElements(By.name("servClass"));
		int serclassleng = serclass.size();
		System.out.println(serclassleng);
		String actualserclassvalue = sh.getCell(4,1).getContents();
		
		for (int k=0; k<=serclassleng-1; k++)
		{
		if (actualserclassvalue.equalsIgnoreCase(serclass.get(k).getAttribute("value")));
		{
			serclass.get(k).click(); 
		}	
		}
		//Service Class
		
		// Airline
		Select airline = new Select(driver.findElement(By.name("airline")));
		String airlinevalue = sh.getCell(5,1).getContents();
		airline.selectByVisibleText(airlinevalue);
		// Airline
		
		// Click on Submit button
		driver.findElement(By.name("findFlights")).click();
		
		
	}
	
}
