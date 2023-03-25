package mypac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MohanRaj {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.etsy.com/");
		String a = driver.getTitle();
		System.out.println(a);
		
		String d = driver.getCurrentUrl();
		System.out.println(d);
		
		driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		WebElement s = driver.findElement(By.xpath("(//input[@class='wt-input '])[1]"));
		js.executeScript("arguments[0].setAttribute('value','mohanrajk6596@gmail.com')",s);
		
		WebElement v = driver.findElement(By.xpath("(//input[@class='wt-input '])[2]"));
		js.executeScript("arguments[0].setAttribute('value','Mohan@06')",v);
		
		WebElement f = driver.findElement(By.name("submit_attempt"));
		js.executeScript("arguments[0].click()",f);
		  
	}
	//@FindBy(xpath="(//span[@class='wt-icon'])[1]")
		//private WebElement Menu;
	
	@FindBy(xpath="//a[@class='wt-text-link-no-underline']")
	private WebElement  Jewellery;
	
	@FindBy(xpath="(//strong[text()='Bags & Purses'])[1]")
	private WebElement  Bags;
	
	@FindBy(xpath="(//strong[text()='Backpacks'])[1]")
	private WebElement  BackBags;
	
	@FindBy(xpath="//p[text()='Travelling']")
	private WebElement  Travelling;
	
	@FindBy(xpath="(//div[@class='height-placeholder'])[2]")
	private WebElement  SecongImageBaG;

	
	

}
