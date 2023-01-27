package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Attributes {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://instagram.com");
		Thread.sleep(5000);
		
		WebElement Mobile=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
Mobile.sendKeys("7729024404");
String Attribute=Mobile.getAttribute("value");


	if(!Attribute.isEmpty())
	{
	
	if(Attribute.contains("7729024404"))
System.out.println("testpass");
	else
	System.out.println("testfail");

} 
	
	else
	
{
	System.out.println("value not present in editbox");
	
	
}
	}
	

}

