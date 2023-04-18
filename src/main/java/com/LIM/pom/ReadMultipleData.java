package com.LIM.pom;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.genericUtilities.IPathConstants;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		readMultipleSetOfData("Client");
	}
	public static Object[][] readMultipleSetOfData(String sheetname) throws EncryptedDocumentException, IOException
	{
		FileInputStream  fis=new FileInputStream("./src/test/resources/Edu.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("DP");
		int lastrow=sh.getLastRowNum()+1;
		int lastcolumn=sh.getRow(0).getLastCellNum();
		
		Object[][] obj=new Object[lastrow][lastcolumn];
		for(int i=0;i<lastrow;i++)
		{
			for(int j=0;j<lastcolumn;j++)
			{
				obj[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return obj;
	}


}
