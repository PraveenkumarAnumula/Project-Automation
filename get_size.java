package get;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_size {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		WebElement demo=driver.findElement(By.xpath("(//button[contains(.,'Book a Free Demo')])[2]"));
		
                 int dimensions_height=demo.getSize().getHeight();
                 int dimensions_width=demo.getSize().getWidth();
                 System.out.println(dimensions_height);
                 System.out.println(dimensions_width);
                 
	}

}
