package mouse_interactions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_click_actions

{
	public static void main(String[] args) throws Exception 
	
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://bridgeqsystems.com/demo.php");
		driver.manage().window().maximize();;
	
	Thread.sleep(4000);
	
	WebElement element=driver.findElement(By.xpath("//span[contains(.,'HVAC Heating Unit')]"));
	new Actions(driver).doubleClick(element).perform();
	
	}}

		