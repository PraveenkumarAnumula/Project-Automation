package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Userlogin {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://facebook.com");
	
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("7729024404");
	Thread.sleep(4000);
	driver.findElement(By.id("pass")).sendKeys("@Praveen1");
	Thread.sleep(4000);;
	driver.findElement(By.name("login")).click();
	
}
}