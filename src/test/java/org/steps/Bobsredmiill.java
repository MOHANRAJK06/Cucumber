package org.steps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import mypac.Baseclass;
import mypac.Page;

public class Bobsredmiill extends Baseclass {

	public static Page p;
	
	public static JavascriptExecutor js;

	@Given("User launch the bobsredmill application")
	
	public void user_launch_the_bobsredmill_application() {

		laChorme();
		loadUrl("https://www.bobsredmill.com/");
		wMaximaize();
		priTittle();

	}
	// User Login

	@When("user enter user name {string} and password {string}")
	public void user_enter_user_name_and_password(String First, String Second) {

		System.out.println("1");
		p = new Page();

		buttonClick(p.getSignIn());
		// driver.findElement(By.xpath("//span[@class='btn-top-account']")).click();

		// WebElement Id = driver.findElement(By.xpath("(//input[@type='email'])[1]"));

		// WebElement PASS =
		// driver.findElement(By.xpath("(//input[@type='password'])[2]"));

		// js.executeScript("arguments[0].setAttribute('value','"+First+"')", Id);

		// js.executeScript("arguments[0].setAttribute('value','"+Second+"')", PASS);

		System.out.println(First + Second);

		jsExecutor1("arguments[0].setAttribute('value','" + First + "')", p.getPassmailId());

		jsExecutor1("arguments[0].setAttribute('value','" + Second + "')", p.getPassPssword());

		System.out.println("2");
	}

	@When("user click login button")
	public void user_click_login_button() {

		System.out.println("3");

		js = (JavascriptExecutor) driver;

		// WebElement submit =
		// driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		p = new Page();
		jsExecutor3(p.getSubmitButton());

		System.out.println("4");

	}

	@When("user sees the home page")
	public void user_sees_the_home_page() {

		System.out.println("Success1");
	}

	// Product Add to the cart

	@When("user go to products section")
	public void user_go_to_products_section() {

		System.out.println("11");
		p = new Page();
		mOVETO(p.getProduct());
	}

	@When("user click product selected  button")
	public void user_click_product_selected_button() throws InterruptedException {
		p = new Page();
		buttonClick(p.getGrand());

		buttonClick(p.getImage());
	}

	@Then("user sees the added  one item in cart")
	public void user_sees_the_added_one_item_in_cart() {
		wImplicit();
		buttonClick(p.getAddStore());

		System.out.println("22");
		System.out.println("Success4");

	}

	// User Go To Search Box
	@When("user Enter the {string}  in search  Box")
	public void user_Enter_the_in_search_Box(String search) {

		p = new Page();
		buttonClick(p.getSearchClick());
		WebElement pass = p.getSearchupdate();
		findEle(pass, search);

	}

	@When("user click the Search box")
	public void user_click_the_Search_box() throws AWTException {

		System.out.println("Success5");

	}

	@Then("user Sees Relevanc products")
	public void user_Sees_Relevanc_products() {

		System.out.println("Done");

	}

	// Multiple Value pass
	@Given("User to Launch  the Url")
	public void user_to_Launch_the_Url() {
		EdgeLaunch();
		loadUrl("https://www.bobsredmill.com/");
		wMaximaize();
		priTittle();
	}

	@When("User move to the Product-Categeory Dropdown")
	public void user_move_to_the_Product_Categeory_Dropdown() {
		p = new Page();
		mOVETO(p.getProduct());

	}

	@When("User Click  to the  Multiple Food Product  {string}")
	public void user_Click_to_the_Multiple_Food_Product(String search) {
		WebElement Multi = driver.findElement(By.xpath("//span[text() = '" + search + "']"));
		mOVETO(Multi);
		buttonClick(Multi);

	}

	@When("User add to the FindStore")
	public void user_add_to_the_FindStore() {

		System.out.println("Start1");

		p = new Page();

		buttonClick(p.getSelectmultiproduct());

		// WebElement product1=
		// driver.findElement(By.xpath("(//img[@class='product-image-photo'])[3]"));
		// product1.click();

		System.out.println("End1");
		System.out.println("Start2");
		// WebElement product2=
		// driver.findElement(By.xpath("(//img[@class='product-image-photo'])[1]"));
		// product2.click();

		// WebElement product3 =
		// driver.findElement(By.xpath("(//img[@class='product-image-photo'])[2]"));
		// product3.click();

		System.out.println("End2");

	}

	@Then("User Sees the Selected  Item")
	public void user_Sees_the_Selected_Item() {

		System.out.println("Good");

		wImplicit();

		buttonClick(p.getFindstoreclick());
		// WebElement Findstore1= driver.findElement(By.xpath("(//a[text()='Store
		// Finder'])[2]"));
		// Findstore1.click();

		wImplicit();
		System.out.println("Succes");
	}
	// WebElement Findstore2= driver.findElement(By.xpath("(//a[text()='Store
	// Finder'])[2]"));
	// Findstore1.click();

	// WebElement Findstore3= driver.findElement(By.xpath("(//a[text()='Store
	// Finder'])[2]"));
	// Findstore1.click();

}
