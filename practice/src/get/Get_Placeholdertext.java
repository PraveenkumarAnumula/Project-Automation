package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Placeholdertext {

	public static void main(String[] args)
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://outlook.com");
		
		WebElement SignInButton=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
		SignInButton.click();
		
		
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
	    String Runtime=email.getAttribute("placeholder");
		
	    
	    if(Runtime.equals("Email, phone, or Skype"))
			System.out.println("TestPass, Data found");
				
				
			else
			{
				System.out.println("TestFail, Data not found");
			}
		
		
		
	}

}
