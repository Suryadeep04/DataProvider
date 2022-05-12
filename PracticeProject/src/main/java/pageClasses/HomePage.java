package pageClasses;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class HomePage extends BaseClass{

	@FindBy(xpath = "//input[@name=email")
	WebElement useremail;
	
	@FindBy(xpath = "//input[@name=password")
	WebElement password;
	
	@FindBy(xpath = "//div[contains(text(),'Login')]")
	WebElement loginbutt;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	
 
}
