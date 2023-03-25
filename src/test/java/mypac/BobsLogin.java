package mypac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class BobsLogin {
	
public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.bobsredmill.com/");
		
		driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println(a);
		
		
		driver.findElement(By.xpath("//span[@class='btn-top-account']")).click();
		
		WebElement Id = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		
		
		WebElement PASS = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('value','MOHAN')", Id);
		
		js.executeScript("arguments[0].setAttribute('value','Mohan@06')", PASS);
		
		js.executeScript("arguments[0].click()", submit);
		
		
		
		
	
		
		
		
}
}
	

	
	



