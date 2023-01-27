package mouse_interactions;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		
		public class Mouse_hover_actions
		
		{

			public static void main(String[] args) throws Exception
			
			{
			
				WebDriver driver=new ChromeDriver();
				driver.get("https://paytm.com/");
				driver.manage().window().maximize();
				
				//Performing hover action at selected targets
				Thread.sleep(4000);
				
		        WebElement payforcons=driver.findElement(By.xpath("//a[contains(.,'Paytm for Consumer')]"));
				new Actions(driver).moveToElement(payforcons).build().perform();
				Thread.sleep(4000);

				
				WebElement payments=driver.findElement(By.xpath("(//div[@class='_2dve7'])[1]"));
				new Actions(driver).moveToElement(payments).build().perform();
				Thread.sleep(4000);
				

				WebElement onlinepay=driver.findElement(By.xpath("//a[@href='https://paytm.com/online-payments']"));
				new Actions(driver).click(onlinepay).perform();
				
				
				
}
		}
