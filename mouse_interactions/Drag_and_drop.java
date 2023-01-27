package mouse_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_and_drop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
         driver.manage().window().maximize();

Thread.sleep(4000);

WebElement scrollbutton=driver.findElement(By.xpath("//*[@id=\"js-rangeslider-0\"]/div[2]"));
new Actions(driver).dragAndDropBy(scrollbutton, 40, 0).build().perform();

//Thread.sleep(4000);



}
}
