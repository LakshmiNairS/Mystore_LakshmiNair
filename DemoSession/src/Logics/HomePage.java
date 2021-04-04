package Logics;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Helper.HelperFunctions;
import Pages.IndexPageObject;

public class HomePage extends HelperFunctions


{
	
	Property p;
	static WebDriver driver;
IndexPageObject indexpage = new IndexPageObject();




@BeforeSuite
	public void initBrowser() throws Exception {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	System.out.println("The Browser is launched ");
	 p = new Property("src\\Common.Properties");
	System.out.println("The URL is captured from Properties file");
	
	
	Thread.sleep(5000);
	String url = p.getdata("URL");
	driver.get(url);
	Thread.sleep(6000);
	System.out.println("The URL is get to Browser");
	driver.manage().window().maximize();
	
}

/*@Test(priority =1)
public void testcase1() throws Exception

{  System.out.println("Entered into this Test");
	scrollPage(driver, indexpage.facebookicon);
	String parent = driver.getWindowHandle();
	waittime(driver,20,indexpage.facebookicon,"VISIBILITY");
	driver.findElement(indexpage.facebookicon).click();
	System.out.println("The facebook icon is clicked");
	Set<String> child = driver.getWindowHandles();
	Iterator<String> i = child.iterator();
	while(i.hasNext())
	{
		String ChildWindow = i.next();
        if (!parent.equalsIgnoreCase(ChildWindow)) {
        driver.switchTo().window(ChildWindow);
        String childpageTitle=driver.getTitle();
        System.out.println("The New tab is opened " +childpageTitle);
        driver.close();
	}
	}
	driver.switchTo().window(parent);
	System.out.println(parent);
	Thread.sleep(3000);
	
	
}*/


@Test(priority =2 )
public void testCase2() throws Exception 

{	
	
	Thread.sleep(3000);
	
	scrollPage(driver, indexpage.SignIN);
	waittime(driver,20,indexpage.SignIN,"VISIBILITY");
	driver.findElement(indexpage.SignIN).click();
	System.out.println("SigIN button is clicked");
	
	String email = p.getdata("email").toString();
	driver.findElement(indexpage.emailadressCA).sendKeys(email);
	System.out.println("The Emailadress is entred");
	scrollPage(driver, indexpage.createanAccount);
	driver.findElement(indexpage.createanAccount).click();
	System.out.println("CreateAccount is clicked");
	Thread.sleep(5000);
	String fn = p.getdata("firstname");
	driver.findElement(indexpage.firstname).sendKeys(fn);
	System.out.println("Firstname is entred");
	String ls = p.getdata("lastname");
	driver.findElement(indexpage.lastname).sendKeys(ls);
	System.out.println("Lastname is entred");
	
	driver.findElement(indexpage.mrsradiobutton).click();	
	System.out.println("Radiobutton is clicked");
	String pwd=p.getdata("password");
	driver.findElement(indexpage.password).sendKeys(pwd);
	scrolldown( driver,indexpage.date,12);
	System.out.println("The Date is selected");
	scrolldown(driver,indexpage.month,02);
	System.out.println("The month is selected");
	scrolldown(driver,indexpage.year,2005);
	System.out.println("The year is selected");
	
	
	
	
	
	
	
	
}


/*@Test(priority=3)

public void testcase3() throws Exception {
	FileReader file = new FileReader("src\\Common.Properties");
	Properties prop1 = new Properties();
	prop1.load(file);
	String email = prop1.get("email").toString();
	driver.findElement(indexpage.newsletter).sendKeys(email);
	System.out.println("The newsletter is entered");
	driver.findElement(indexpage.okaybutton).click();
	
	String  actualMSG = driver.findElement(indexpage.alertMessage).getText();
	if (actualMSG.contains("Successfully subscribed")) 
	{
		System.out.println("The user is successfully subscribed to newsletter");
		
	}else if(actualMSG.contains("already registered."))
	{
		System.out.println("The user is already subscribed to newsletter with the give emailid");}
	
	
	
}*/

@AfterSuite
public void closer() {
driver.close();
}


}
