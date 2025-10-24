package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelect {

	public static void main(String[] args) {
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
    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Unicorn Company");
    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sushmitha");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravichandran");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7777728694");
  //sourcedd
  		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
  		//instantiate select class
  		
  		Select sel=new Select(sourceDD);
  		sel.selectByIndex(4);
  		//industryDD
  		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
  		Select sel1=new Select(marketingCampaign);
  		sel1.selectByValue("CATRQ_AUTOMOBILE");
  		
  		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
  		Select sel2=new Select(ownership);
  		
  		sel2.selectByVisibleText("Corporation");
  		
  		driver.findElement(By.className("smallSubmit")).click();
  		//driver.getTitle();
  		//System.out.println("Success");
  		driver.close();



		
		
		
		
		
	}

}
