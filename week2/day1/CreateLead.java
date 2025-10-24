package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
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
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Swiggy Company");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vennila");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Deepak");
    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("QA Lead");
    driver.findElement(By.name("submitButton")).click();
    Thread.sleep(5000);

    System.out.println(driver.getTitle());
    driver.close();
		
		
		
		
		
		
		
	}

}
