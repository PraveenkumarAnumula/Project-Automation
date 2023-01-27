package switch_commands;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_with_cancel_button

{

	public static void main(String[] args)
	
	{
		WebDriver driver=new ChromeDriver();    
		
		//Launching browser method
		driver.get("http://demo.automationtesting.in/Alerts.html");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    
	    WebElement cancel_column=driver.findElement(By.xpath("//a[@href='#CancelTab']"));
	    cancel_column.click();
	    
	    
	    WebElement cancel_button=driver.findElement(By.xpath("//button[@class='btn btn-primary'][contains(.,'click the button to display a confirm box')]"));
	    
	    cancel_button.click();
	    
	    
	    //cancel the alert
	   //driver.switchTo().alert().dismiss();
	 //  System.out.println("clicked the cancel button");
	    
	    String alertmsg=driver.switchTo().alert().getText();
	    System.out.println(alertmsg);
	    //press OK button
	    driver.switchTo().alert().accept();
	    System.out.println("clicked the ok button");
	    

	}

}
