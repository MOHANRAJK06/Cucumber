package mypac;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Maks {
	
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	
	
	driver.get("https://www.carrefour.fr/");
	
	driver.manage().window().maximize();
	String a = driver.getTitle();
	System.out.println(a);
	
	
	
	
	Thread.sleep(3000);
	
	WebElement ss = driver.findElement(By.id("onetrust-accept-btn-handler"));
	ss.click();
	
	//WebElement menu = driver.findElement(By.id("data-rayons"));
	//menu.click();
	
	//WebElement Second = driver.findElement(By.xpath("(//a[@class='nav-item__menu-link'])[2]"));
	//Second.click();
	
	
	//WebElement Third = driver.findElement(By.xpath("(//a[@data-testid='nav-item-link'])[8]"));
	//Third.click();
	
	
	
	//WebElement s = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	//s.click();
	
	

     
	WebElement hair = driver.findElement(By.name("q"));
	
	hair.sendKeys("shoes");
	
	WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	search.click();
	
	Thread.sleep(5000);
	WebElement img = driver.findElement(By.xpath("(//img[@class='image image--hidden product-card-image__image ls-is-cached image--loaded'])[2]"));
	img.click();
	
	
	
	
	//WebElement dd = driver.findElement(By.xpath("//a[@aria-label='Menu']"));
	//WebElement search = driver.findElement(By.xpath("//a[text()='Brands']"));
	
	
	
	//JavascriptExecutor js = (JavascriptExecutor)driver;
	
	//js.executeScript("arguments[0].click",hair);
	
	//js.executeScript("arguments[0].click",dd);
	
    //js.executeScript("arguments[0].click", search);
	
	
	//WebElement women = driver.findElement(By.xpath("(//span[text()='Womens'])[2]"));
	
	//WebElement SS = driver.findElement(By.xpath("(//span[@type='button'])[1]"));
	//js.executeScript("arguments[0].click", SS);
	
	////span[@class='Iconstyled__StyledIcon-sc-p0hqzp-0 eFSAPu']

	
	
	
	}
}
	