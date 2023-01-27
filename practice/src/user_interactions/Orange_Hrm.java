package user_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Orange_Hrm {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin",Keys.TAB);
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
		driver.findElement (By.xpath("//button[@type='submit']")).click();
		WebElement PIMM=driver.findElement(By.xpath("//a[contains(.,'PIM')]"));
		new Actions(driver).moveToElement(PIMM).perform();
		driver.findElement(By.xpath("//a[contains(.,'PIM')]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'][contains(.,'-- Select --')])")).click();
		driver.findElement(By.xpath("//span[contains(.,'Full-Time Contract')]")).click();
		driver.findElement(By.xpath("(//i[contains(@class,'oxd-icon bi-caret-down-fill oxd-select-text--arrow')])[3]")).click();
		driver.findElement(By.xpath("(//div[contains(.,'Support Specialist')])[15]")).click();
		driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Search')]")).click();
		
	

}
}
