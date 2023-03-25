package mypac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bobsadtocart {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.bobsredmill.com/");
		
		driver.manage().window().maximize();
		String a = driver.getTitle();
		System.out.println(a);
		
		
		
		
		Thread.sleep(3000);
		
		Actions Ac = new Actions (driver);
		Thread.sleep(3000);
		WebElement ss = driver.findElement(By.xpath("(//a[text()='Products'])[1]"));
	    Ac.moveToElement(ss).perform();
	    
		WebElement Gran = driver.findElement(By.xpath("//span[text()='Granola']"));
	    Gran.click();
	    
	    WebElement img = driver.findElement(By.xpath("(//img[@class='product-image-photo'])[2]"));
	    img.click();
	    
	    WebElement add = driver.findElement(By.xpath("(//a[text()='Store Finder'])[2]"));
	    add.click();
	    
	    WebElement Code = driver.findElement(By.xpath("(//input[@id='zipInp1'])"));
	    Code.sendKeys("85001");
	    
	    
	  
	    
		
	    
	    

}
}
