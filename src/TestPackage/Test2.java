package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F://Selenium downloads//chromedriver_win32//chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();    // this line launch chrome browser
		driver.get("http://www.google.co.in");
		
		
		//F:\Selenium downloads\chromedriver_win32
		
		/*System.setProperty("webdriver.gecko.driver","F://Selenium downloads//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		driver.get("http://www.google.com");
		System.out.println("Url opened succesfully");
		String s=driver.getCurrentUrl();
		System.out.println("Page url:"+s);

	}

}
