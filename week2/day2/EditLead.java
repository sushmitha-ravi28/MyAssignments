package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		//Launch the Browser as Guest user to avoid pop-up
		ChromeOptions option = new ChromeOptions();
		option.addArguments("Guest");
		
		//Instantiate the Browser
		ChromeDriver driver = new ChromeDriver(option);
		//Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the Window
		driver.manage().window().maximize();
		
		//Login using username and password with the help of basic locators
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Navigate to Leads section
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Create Lead using X-path
		driver.findElement(By.xpath("//input[@id ='createLeadForm_companyName']")).sendKeys("Accenture");
		driver.findElement(By.xpath("(//input[@name ='firstName'])[3]")).sendKeys("Sushmitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ravichandran");
		driver.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Sushmitha R");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Engineering | Quality Assurance");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("The Create Leads section allows users to add new potential customer details into the CRM system to generate a unique lead record.");
        driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("sushmitha.ravichandran444@gmail.com");
        
        //Select Drop-down using VisibleText Helper Method
        WebElement stateProvinceDD = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select selstate = new Select(stateProvinceDD);
        selstate.selectByVisibleText("New York");
		
        //Create Lead
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		//Edit Lead
		Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		//Clear the Description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Update the Important Note
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Production Environment Readiness");
		
		//Update Lead
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		//Get the Title of the Resulting Page
		System.out.println(driver.getTitle());
		
		//Close the Browser
		driver.close();
		
				
	}

}
