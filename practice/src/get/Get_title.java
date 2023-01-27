package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_title {
public static void main(String[] args) throws Exception 

{
	WebDriver driver=new ChromeDriver();     //Launching browser method
	driver.get("https://www.instagram.com/accounts/emailsignup/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
    if(driver!=null)
    {
    	if
    	
    	(driver.getTitle().equals("Instagram"))
    	
    	{
    		
    		System.out.println("Navigate to insta");
    		
    		
    		WebElement signup=driver.findElement(By.xpath("(//div[contains(.,'Sign up')])[15]"));
    		signup.click();
    		Thread.sleep(4000);
    		
    		if
    		
    		(driver.getTitle().contains("Sign up"))
    		System.out.println("Title is verified");
    		
    			else 
    			
    	     
    		System.out.println("title is not present");
    		
    	}
    	else
    		System.out.println("Page not verified");
    	
    			
    		}
    			
    			
    		}
    		
    		
    		
    	
    
	
	
	
	
}

