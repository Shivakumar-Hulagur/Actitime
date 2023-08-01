package com.actitime.generic;

import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FileLib {

	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/commondata.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

	public String getExcelData(String sheet,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	public void setExcelData(String sheet,int row,int cell,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./testdata/TestScriptdata.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);
		FileOutputStream fos=new FileOutputStream("./testdata/TestScriptData.xlsx");
		wb.write(fos);
	}
	public void performMoveToElement(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	public void performDoubleClick(WebDriver driver,WebElement element)
	{
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void performDragAndDrop(WebDriver driver,WebElement source,WebElement target)
	{
		Actions a=new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public void performContextClick(WebDriver driver,WebElement element) throws InterruptedException
	{
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
		Thread.sleep(2000);
	}
	public void performSelectByIndex(WebElement element,int index)
	{
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void performSelectByValue(WebElement element,String value)
	{
		Select s=new Select(element);
		s.selectByValue(value);
	}
	public void performSelectByVisibleText(WebElement element,String text)
	{
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
	public void performDeselectByIndex(WebElement element,int index)
	{
		Select s=new Select(element);
		s.deselectByIndex(index);
	}
	public void performDeselectByValue(WebElement element,String value)
	{
		Select s=new Select(element);
		s.deselectByValue(value);
	}
	public void performDeselectByVisibleText(WebElement element,String text)
	{
		Select s=new Select(element);
		s.deselectByVisibleText(text);
	}
	public void performDeselectAll(WebElement element)
	{
		Select s=new Select(element);
		s.deselectAll();
	}
	public String performGetFirstSelectedOption(WebElement element)
	{
		Select s=new Select(element);
		WebElement ele = s.getFirstSelectedOption();
		return ele.getText();
	}
	public  List<WebElement> performGetAllSelectedOptions(WebElement element)
	{
		Select s=new Select(element);
		List<WebElement> ele = s.getAllSelectedOptions();
		return ele;
	}
	public boolean performIsMultiple(WebElement element)
	{
		Select s=new Select(element);
		boolean res = s.isMultiple();
		return res;
	}
	public List<WebElement>  performGetAllOptions(WebElement element)
	{
		Select s=new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}
	public String performGetWrappedElement(WebElement element)
	{
		Select s=new Select(element);
		WebElement ele = s.getWrappedElement();
		return ele.getText();
	}

}
