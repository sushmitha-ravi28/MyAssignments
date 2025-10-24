package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Accounts")).click();
	driver.findElement(By.partialLinkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("Sushmitha Ravichandran");
	driver.findElement(By.name("description")).sendKeys("Automation Tester");
	driver.findElement(By.id("numberEmployees")).sendKeys("10000");
	driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	Thread.sleep(5000);

	driver.findElement(By.className("smallSubmit")).click();
  System.out.println(driver.getTitle());
	driver.close();
			
	
	}

}
