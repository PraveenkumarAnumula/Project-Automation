package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Double_fare_disable {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * Scenario:--> Verifying Double Seat fares Disabled
		 * 				on roundtrip selection
		 * 
		 * 		Give site url is  http://makemytrip.com
		 * 		When User Select Roundtrip Radio button
		 * 		And verify roundtrip is selected
		 * 		Then Verify Double fares checkbox is disabled
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makemytrip.com");
		Thread.sleep(10000);
		WebElement trip=driver.findElement(By.xpath("//li[@data-cy='roundTrip'][contains(.,'Round Trip')]"));
		trip.click();
		
	    String Runtime=trip.getAttribute("class");
	    if(Runtime.contains("selected"))
	    	
	    {
	    	System.out.println("Round tripp is selected");
	   WebElement doublefares=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div[1]/ul/li[6]"));
	   String time=doublefares.getAttribute("class");
	   if(time.contains("isItemDisabled"))
	   System.out.println("Testpass ItemDisabled");
	   else 
	   
		   System.out.println("Testfail, Item enabled");
	   
	}
	   else
	   {
	    	System.out.println("Roundtrip  not selected");
	    
	    }
	}

}
