package mouse_interactions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_click {

	public static void main(String[] args) throws Exception {
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		WebElement riteclik=driver.findElement(By.xpath("/html/body/div[1]/section/div/div/div/p/span"));
		new Actions(driver).contextClick(riteclik).perform();
		
		Thread.sleep(4000);
		
		WebElement options=driver.findElement(By.xpath("/html/body/ul/li[3]"));
		new Actions(driver).contextClick(options).perform();
         driver.switchTo().alert().accept();
	}

}
