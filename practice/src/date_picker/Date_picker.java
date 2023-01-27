package date_picker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Date_picker {

	public static void main(String[] args) throws Exception {
	   
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/datepicker/dropdown-month-year.html");
     driver.manage().window().maximize();	
    Thread.sleep(4000);
    
    
    driver.findElement(By.xpath("//input[@id='datepicker']")).click();
    Thread.sleep(4000);
    
    new Select(driver.findElement(By.xpath("//select[@aria-label='Select month']"))).selectByVisibleText("Jul");
    Thread.sleep(4000);
    
   new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']"))).selectByVisibleText("2013");
   Thread.sleep(4000);
   
   
    
    driver.findElement(By.xpath("(//a[@href='#'])[7]")).click();
	}

}

