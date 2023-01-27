package date_picker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autocomplete_editbox {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@data-cy='landingContainer']")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold  appendBottom5'][contains(.,'From')]")).click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("HYD");
		
		driver.findElement(By.xpath("//p[@class='font14 appendBottom5 blackText'][contains(.,'Hyderabad, India')]")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//span[contains(.,'To')])[1]")).click();
		
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("DXB");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//p[contains(.,'Dubai, United Arab Emirates')]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[contains(.,'6₹ 17,621')])[20]")).click();
		

		driver.findElement(By.xpath("//a[contains(.,'Search')]")).click();
		
		
		
		

		
		

		
		
	}

}
