package Cucumber.DemoJenkins2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo2 {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		System.out.println("hi");
		Assert.assertEquals(driver.findElement(By.id("pah")).getText(), "PracticeAutomationHere");
	}

}
