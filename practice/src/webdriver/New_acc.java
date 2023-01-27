package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_acc {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("firstname")).sendKeys("Praveen"+Keys.TAB+"Anumula"+Keys.TAB+"7729024404"+Keys.TAB+"@Praveen");
		driver.findElement(By.name("birthday_day")).sendKeys("20");
		driver.findElement(By.id("month")).sendKeys(Keys.ARROW_UP,Keys.ARROW_DOWN);
		
		
		
	}

}
