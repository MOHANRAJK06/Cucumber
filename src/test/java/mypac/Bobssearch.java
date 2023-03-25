package mypac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bobssearch {
public static void main(String[] args) throws InterruptedException, AWTException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.bobsredmill.com/");
	
	driver.manage().window().maximize();
	String a = driver.getTitle();
	System.out.println(a);
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("(//span[text()='Search'])[1]")).click();
	Robot r = new Robot();
	WebElement searchMeals = driver.findElement(By.id("search"));
	searchMeals.sendKeys("Meals");
	Thread.sleep(3000);
searchMeals.click();
	
	
	
      WebElement OrangePacket = driver.findElement(By.xpath("(//img[@class='jss520'])[3]"));
       OrangePacket.click();
		
	WebElement Storefind = driver.findElement(By.xpath("//a[text()='Store Finder']"));
	Storefind.click();
}
}
