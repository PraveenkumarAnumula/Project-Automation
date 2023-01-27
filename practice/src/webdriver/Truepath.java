package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Truepath {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://outlook.live.com/owa/");
driver.findElement(By.linkText("Sign in")).click();
driver.findElement(By.name("loginfmt")).sendKeys("pchintu147@gmail.com");
driver.findElement(By.id("idSIButton9")).click();
driver.findElement(By.name("passwd")).sendKeys("@Praveen2");
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@value='Sign in']")).click();


}}
