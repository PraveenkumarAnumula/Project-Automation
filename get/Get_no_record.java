package get;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_no_record {

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
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("1234");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	String norec=driver.findElement(By.xpath("//span[contains(.,'No Records Found')]")).getText();
	System.out.println(norec);
	
	}

}
