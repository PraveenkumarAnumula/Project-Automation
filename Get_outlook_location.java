package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_outlook_location {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/owa/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//locating the signIn button
		WebElement signin=driver.findElement(By.xpath("(//a[contains(.,'Sign in')])[1]"));
	
		//location of the X coordinate of signIn button
		int obj_Xidentify=signin.getLocation().getX();
		System.out.println("The object identified is "+obj_Xidentify);
		
		//location of the X coordinate of signIn button
		int obj_Yidentify=driver.manage().window().getSize().getWidth();
		
		//if Y is greater than half of the X means i is in the right side
		if(obj_Yidentify > obj_Xidentify/2)
			System.out.println("sign in button is in the right side");
		
		else
		{
			System.out.println("sign in btton is left side");
		}
	
	//How to Verify object is visible at webpage  (something>0 implies somen=thing is present inside)
			
		
		if(signin.getLocation().getX() > 0)
				System.out.println("Object visible at webpage");
			else
				System.out.println("Object hidde at webpage");
			
	
	
}
}
