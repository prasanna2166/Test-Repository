package com.prasanna.dm;

import jxl.Cell;
import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class OpenDm  {
	static Sheet sh;
	 
	public static void main(String[] args) throws Exception{

	File src = new File("C:/Users/501316/workspace/Project_demoaut/credentials.xls");
	Workbook wb = Workbook.getWorkbook(src);
	sh = wb.getSheet(0);
	
	Base.start();
	Base.launch(sh);
	TicketBooking.booking1();
	SelectFlight.select();
	System.out.println("End launch");
	Reviewpage.verify();
	Thread.sleep(5000);
	Base.driver.close();
}	
}


