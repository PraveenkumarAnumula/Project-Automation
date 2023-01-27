package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchbrowsers {
public static void main(String[] args) {
 ChromeDriver obj=new ChromeDriver();
	obj.get("http;//www.facebook.com");
	System.out.println(obj.getTitle());
	obj.close();
}
}
