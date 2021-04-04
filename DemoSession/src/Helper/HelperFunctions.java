package Helper;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.IndexPageObject;

public class HelperFunctions {
	
	public void scrollPage(WebDriver driver, By xpathValue)
	{
		WebElement ele = driver.findElement(xpathValue);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}
	
	public void waittime(WebDriver driver,int time, By xpathValue,String condition) 
	{
		WebElement ele = driver.findElement(xpathValue);
		WebDriverWait wait=new WebDriverWait(driver, time);
		if(condition.toUpperCase()=="VISIBILITY")
		{
		wait.until(ExpectedConditions.visibilityOf(ele));
		}
		else if(condition.toUpperCase()=="SELECTED")
		{
		wait.until(ExpectedConditions.elementToBeSelected(ele));
		}}
		
		
		public void prop(WebDriver driver, By Xpathvalue ) throws Exception 
		{
			FileReader file = new FileReader("src\\Common.Properties");
			Properties prop1 = new Properties();
			prop1.load(file);
			IndexPageObject indexpage = new IndexPageObject();
			scrollPage(driver, indexpage.firstname);
			
		}
		
		public void scrolldown(WebDriver driver,By xpathvalue, int value)
		{
			 Select select = new Select(driver.findElement(xpathvalue));
		       select.selectByIndex(value);
		}
		
		
	}
	


