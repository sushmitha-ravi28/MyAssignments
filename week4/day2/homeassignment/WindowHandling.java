package week4.day2.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("Guest");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
       //Accessing From Contact widget
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
        Thread.sleep(2000);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String> childWindow = new ArrayList<>(windowHandles);
        driver.switchTo().window(childWindow.get(1));
        driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
        driver.switchTo().window(childWindow.get(0));
       //Accessing To Contact Widget
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        Thread.sleep(2000);
        Set<String> windowHandles2 = driver.getWindowHandles();
        List<String> childWindow2 = new ArrayList<String>(windowHandles2);
        driver.switchTo().window(childWindow2.get(1)); // switch to 3rd window
        driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
        driver.switchTo().window(childWindow2.get(0)); // back to main window
        //Merge Contact
        driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
        //Handling the Alert
        driver.switchTo().alert().accept();
        //Page Title
        System.out.println(driver.getTitle());		
	}

}
