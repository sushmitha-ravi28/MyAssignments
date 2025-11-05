package week4.day2.homeassignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraListInterface {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@class='desktop-searchBar']")).sendKeys("Bags",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Laptop Bag']")).click();
		Thread.sleep(2000);
        String totalCount = driver.findElement(By.xpath("//span[@class='title-count']")).getText();
		System.out.println("Total Men Bag Items:" + totalCount);
		
		//Brand Name List
		List<WebElement> listBrand = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		List<String> brandProduct = new ArrayList<String>();
		for (WebElement each : listBrand) {
			brandProduct.add(each.getText());
		}
		System.out.println("Brand Name:" + brandProduct);
		
		//Product Name List
		List<WebElement> listProduct = driver.findElements(By.xpath("//h4[@class='product-product']"));
		List<String> nameProduct = new ArrayList<String>();
		for (WebElement each : listProduct) {
			nameProduct.add(each.getText());
		}
		System.out.println("Product Name:" + nameProduct);
		driver.quit();
		
	}

}
