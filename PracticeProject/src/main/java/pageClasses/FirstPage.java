package pageClasses;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseClass;

public class FirstPage extends BaseClass{

	@FindBy(xpath = "//a[contains(text(),'Login')]")
	WebElement loginButton;
	
	public FirstPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage clickloginbutton() throws IOException{
		loginButton.click();
		return new HomePage();
	}
	
}
