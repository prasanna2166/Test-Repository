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
//	int noofrows = sh.getRows(); 
//	int noofcolm = sh.getColumns();
//	String firstcell = sh.getCell(0,0).getContents();
//	String secondcell = sh.getCell(1,0).getContents();
//	String secondrow1cell = sh.getCell(0, 1).getContents();
//	String secondrow2cell = sh.getCell(1, 1).getContents();
//	System.out.println(noofrows);
//	System.out.println(noofcolm);
//	System.out.println(firstcell);
//	System.out.println(secondcell);
//	System.out.println(secondrow1cell);
//	System.out.println(secondrow2cell);
	//System.out.println(sh.getCell(1,1).getContents());
	//Base obj = new Base();
	
	Base.start();
	Base.launch(sh);
	TicketBooking.booking1();
	SelectFlight.select();
	System.out.println("End launch");
	Thread.sleep(5000);
	Base.driver.close();
}	
}


