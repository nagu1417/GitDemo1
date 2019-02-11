package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeApp2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F://Selenium downloads//chromedriver_win32//chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();    // this line launch chrome browser
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.manage().window().maximize();
		try {
			
		 Thread.sleep(1000);                 //1000 milliseconds is one second.
		} 
		catch(InterruptedException ex) {
		   Thread.currentThread().interrupt();
		}

		//Thread.sleep(2000);
		//think(3);
	/*	driver.findElement(By.name("firstname")).sendKeys("Nagesh");
		driver.findElement(By.name("lastname")).sendKeys("Golakoti");
		//selecting sex
		driver.findElement(By.xpath("//*[@id='sex-0']")).click();
		//selecting years of experience
		driver.findElement(By.xpath("//*[@id='exp-2']")).click();
		//setting date
		driver.findElement(By.xpath("//*[@id='datepicker']")).sendKeys("03-05-2017");
		*/
		
		
		//selecting multiple checkboxes
		//WebElement Checkbox1=driver.findElement(By.xpath("//*[@id'profession-0']"));
		//Got Invalid selector issue 
		
		/*
		WebElement Checkbox1=driver.findElement(By.cssSelector("#profession-0"));
		Checkbox1.click();
		System.out.println("Selected check box 1");
		WebElement Checkbox2=driver.findElement(By.cssSelector("#profession-1"));
		Checkbox2.click();
		System.out.println("Selected check box 2");*/
		
		
		/*WebElement we=driver.findElement(By.xpath("//*[@id='photo']"));
		we.click();
		//Runtime.getRuntime().exec("Script.exe");
		we.sendKeys("C:\\Users\\Nagesh\\Desktop\\New Text Document.txt");
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.close();
	}

}
