package extra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fg {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	
	
	driver.get("https://www.flipkart.com/");
	
	
	
	System.out.println("hello i am mukesh");

}
}
