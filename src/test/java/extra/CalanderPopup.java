package extra;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CalanderPopup {

	
	
	public static void main(String[] args) throws Throwable {
		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
		
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//*[name()='svg' and @class=' c-pointer c-neutral-900' ]")).click();
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button[1]")).click();
		
		//stating date 
		String s_month="March 2023";
		String s_day="12";
		//return date
		String r_month="May 2023";
		String r_day="10";
		
	
		while(true)
		{
			String ag=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
		
			if(ag.equalsIgnoreCase(s_month))
			{

				driver.findElement(By.xpath("//div[@class='DayPicker-Day']/descendant::div[text()='"+s_day+"']")).click();
				break;
			}
			else
				driver.findElement(By.xpath("//*[name()='svg' and @style='align-self: flex-end;']")).click();
			
			
		}
		
		driver.findElement(By.xpath("//div[@class='flex flex-middle p-relative homeCalender']/button[2]")).click();
        
		
		while(true)
         {
			
			
			String ag2=driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText();
			
			if(ag2.equalsIgnoreCase(r_month))
			{
				driver.findElement(By.xpath("//div[@class='DayPicker-Body']/descendant::div[text()='"+r_day+"']")).click();
				break;
			}
			else
				driver.findElement(By.xpath("//*[name()='svg' and @style='align-self: flex-end;']")).click();
			
			
         }
		driver.findElement(By.cssSelector(".fw-600.fs-4.lh-2.flex.flex-middle")).click();
		
	}
}
