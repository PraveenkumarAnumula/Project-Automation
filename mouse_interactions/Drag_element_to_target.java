package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_element_to_target 


{

	public static void main(String[] args) throws Exception 
	
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://marcojakob.github.io/dart-dnd/basic/");
		driver.manage().window().maximize();
		
		
	
	Thread.sleep(4000);
	//docs x-path
	WebElement element1=driver.findElement(By.xpath("(//img[@class='document'])[1]"));
	WebElement element2=driver.findElement(By.xpath("(//img[@class='document'])[2]"));
	WebElement element3=driver.findElement(By.xpath("(//img[@class='document'])[3]"));
	WebElement element4=driver.findElement(By.xpath("(//img[@class='document'])[4]"));
	  
	//trash x-path
	
	WebElement trash=driver.findElement(By.xpath("//div[@class='trash']"));
	  
	  
	  
	new Actions(driver).dragAndDrop(element1, trash).build().perform();
	new Actions(driver).dragAndDrop(element2, trash).build().perform();
	new Actions(driver).dragAndDrop(element3, trash).build().perform();
	new Actions(driver).dragAndDrop(element4, trash).build().perform();
	
	}

}
