package switch_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alet_Ok_Buttton {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
		WebElement Alert_Prompt_link=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		Alert_Prompt_link.click();
		Thread.sleep(4000);
		
		
		 //Shows the Text Present at alert message
		String Alertmsg=driver.switchTo().alert().getText();
		System.out.println(Alertmsg);
		
		
		  //Press Ok Button At alert
		driver.switchTo().alert().accept();
		
		  //Printing current window title
		System.out.println("Current window title is "+driver.getTitle());
		
		
		
	}

}
