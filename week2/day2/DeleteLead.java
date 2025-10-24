package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
	driver.findElement(By.partialLinkText("Find")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.name("phoneNumber")).sendKeys("987654321");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);

    WebElement firstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
    String leadID = firstLead.getText();
    System.out.println("Lead ID to delete: " + leadID);

    firstLead.click();  // navigate to lead details

    Thread.sleep(2000); // give time for page to load

    driver.findElement(By.linkText("Delete")).click();
	driver.findElement(By.partialLinkText("Find")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.partialLinkText("Find")).click();
	Thread.sleep(2000);
	WebElement messageElement = driver.findElement(By.className("x-paging-info"));
	String messageText = messageElement.getText();
	if(messageText.equals("No records to display")) {
	    System.out.println("Lead deleted successfully.");
	} else {
	    System.out.println("Lead deletion failed.");
	}
	
	driver.close();

	
	
	
	
	}

}
