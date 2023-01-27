package get;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text_records {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin",Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
		driver.findElement (By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys("Lisa");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//reading the whole text and printing
		String cons=driver.findElement(By.xpath("(//div[contains(.,'(1) Record Found')])[8]")).getText();
		System.out.println(cons);
		
			
		//reading the required text and printing it
				
				String Records="(1) Record Found";
				String recs=Records.substring(4);
				System.out.println("The output required is "+recs); 
				
			
		
		
	}

}
