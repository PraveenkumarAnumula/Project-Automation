package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_location {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/?__coig_restricted=1");
		driver.manage().window().maximize();
		
		
		WebElement RoundTrip=driver.findElement(By.xpath("(//div[contains(@class,'_ab21')])[1]"));
		System.out.println(RoundTrip);
	
		System.out.println(RoundTrip.getRect().getX());
		System.out.println(RoundTrip.getRect().getY());
		System.out.println(RoundTrip.getRect().getHeight());
		System.out.println(RoundTrip.getRect().getWidth());
		System.out.println(RoundTrip.getRect().getDimension());
		System.out.println(RoundTrip.getRect().getPoint());
		

	}

}
