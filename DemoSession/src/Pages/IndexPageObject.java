package Pages;

import org.openqa.selenium.By;

public class IndexPageObject extends LoginPageObject

{
	public By facebookicon =By.xpath("//li[@class='facebook']/a");
	public By SignIN = By.xpath("//a[@class='login']");
	public By newsletter =By.xpath("//input[@id='newsletter-input']");
	public By okaybutton= By.xpath("//div[@class='form-group']/button[@type='submit']");
	public By alertMessage = By.xpath("//*[contains(@class,'alert')]");
	
	
	

}
