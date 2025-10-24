package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Instantiate the Browser Driver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://www.facebook.com/");
		//Maximize the window
        driver.manage().window().maximize();
        //Close the Browser
		driver.close();
		
	}

}
