package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) throws Exception 
	
	{
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/menu/");
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		//switching to frame
		WebElement Frame1=driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(Frame1);
		
		Thread.sleep(4000);
		
		//opening the option inside the frame
	WebElement frame=driver.findElement(By.xpath("//div[contains(.,'Movies')]"));
		new Actions(driver).moveToElement(frame).click().perform();
		driver.switchTo().defaultContent();
	
		
		
		
	
		
		
		
    
	}

}
