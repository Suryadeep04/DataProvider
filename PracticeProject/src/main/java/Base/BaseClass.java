package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static Properties prop;
	public static WebDriver driver; 
	
	public static String url;
	public static String username;
	public static String password;
	public static String browser;
	
	public BaseClass() {
		
		try {
		prop = new Properties();
		FileInputStream ip;
		ip = new FileInputStream("C:\\Users\\SU20370349\\eclipse-workspace\\PracticeProject\\src\\main\\java\\configuration\\config.properties");
		prop.load(ip);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		}

	public static void init() {
		browser = prop.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		url = prop.getProperty("url");
		username = prop.getProperty("username");
		password = prop.getProperty("password");
		
		driver.get(url);
	}
	
}
