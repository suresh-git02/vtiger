import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lead {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();;
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	Random r=new Random();
	int ran=r.nextInt(2000);
	
	driver.get("http://rmgtestingserver:8888/");
	driver.findElement(By.name("user_name")).sendKeys("admin");
	driver.findElement(By.name("user_password")).sendKeys("admin");
	driver.findElement(By.id("submitButton")).click();
	
	driver.findElement(By.xpath("//a[@href='index.php?module=Leads&action=index']")).click();
	driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
	WebElement salutation_type=driver.findElement(By.name("salutationtype"));
	
	
	Select s=new Select(salutation_type);
	s.selectByValue("Mr.");
	String name="suresh"+ran;
	System.out.println(name);
	driver.findElement(By.name("firstname")).sendKeys("suresh"+ran);
	driver.findElement(By.name("lastname")).sendKeys("biswal");
	driver.findElement(By.name("company")).sendKeys("testYantra");
	driver.findElement(By.name("mobile")).click();
	driver.findElement(By.name("email")).click();
	driver.findElement(By.name("assigntype")).click();
	driver.findElement(By.name("assigntype")).click();
	
	WebElement rating=driver.findElement(By.name("rating"));
	
	Select s1=new Select(rating);
	s1.selectByValue("Active");
	
	driver.findElement(By.name("country")).sendKeys("india");
	driver.findElement(By.name("button")).click();
 String Expected=driver.findElement(By.className("dvHeaderText")).getText();
 System.out.println(Expected);
	if(Expected.contains(name))
	{
		System.out.println("created");
	}
	else
	{
		System.out.println("not created");
	}

	driver.findElement(By.name("Edit")).click();
	driver.findElement(By.name("phone")).click();
	driver.findElement(By.name("Edit")).click();
	driver.findElement(By.name("Edit")).click();
}
}
