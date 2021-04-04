package Pages;

import org.openqa.selenium.By;

public class AccountCreationPageObject {
	public By mrsradiobutton =By.xpath("//input[@id=\"id_gender2\"]");
	public By firstname = By.xpath("//label[text()='First name ']//following::input[@name='customer_firstname']");
	public By lastname = By.xpath("//label[text()='Last name ']//following::input[@name='customer_lastname']");
	
	
	public By email = By.xpath("//*[@id='email']");
	public By password= By.xpath("//input[@type=\"password\"]");
	public By date = By.xpath("//select[@id=\"days\"]");
	public By month = By.xpath("//select[@id=\"months\"]");
	public By year = By.xpath("//select[@id=\"years\"]");
	




}