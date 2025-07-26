package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demojenkin {
//This is comment
	public static void main(String[] args) {
	

	
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver();
				driver.get("https://omayo.blogspot.com/");
				System.out.println("hi");
				Assert.assertEquals(driver.findElement(By.id("pah")).getText(), "PracticeAutomationHere");
	}
	
	}
