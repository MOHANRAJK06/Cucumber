package mypac;

import java.awt.Image;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page extends Baseclass {
	

	public Page() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="(//a[text()='Products'])[1]")
	private WebElement product;
	
	@FindBy(xpath="//span[text()='Granola']")
	private WebElement Grand;
	
	@FindBy(xpath="(//img[@class='product-image-photo'])[2]")
    private WebElement Image;
	

	@FindBy(xpath="(//a[text()='Store Finder'])[2]")
    private WebElement AddStore;
	
	@FindBy(xpath="(//input[@id='zipInp1'])")
    private WebElement Zipcode;
	
	@FindBy(xpath="(//span[text()='Search'])[1]")
    private WebElement SearchClick;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
    private WebElement Searchupdate;
	
	@FindBy(xpath="(//div[@class='jss519'])[3]")
    private WebElement Selectproduct;
	
	public WebElement getSelectmultiproduct() {
		return Selectmultiproduct;
	}

	public WebElement getFindstoreclick() {
		return Findstoreclick;
	}



	@FindBy(xpath="//span[@class='btn-top-account']")
    private WebElement SignIn;
	
	@FindBy(xpath="(//input[@type='email'])[1]")
    private WebElement PassmailId;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
    private WebElement PassPssword;

	@FindBy(xpath="(//button[@type='submit'])[3]")
    private WebElement SubmitButton;
	
	@FindBy(xpath="(//img[@class='product-image-photo'])[3]")
    private WebElement Selectmultiproduct;
	
	
	
	@FindBy(xpath="(//a[text()='Store Finder'])[2]")
    private WebElement Findstoreclick;
	
	
	
	
	public WebElement getSignIn() {
		return SignIn;
	}

	public WebElement getPassmailId() {
		return PassmailId;
	}

	public WebElement getPassPssword() {
		return PassPssword;
	}

	public WebElement getSubmitButton() {
		return SubmitButton;
	}

	public WebElement getSearchClick() {
		return SearchClick;
	}

	public WebElement getSearchupdate() {
		return Searchupdate;
	}

	public WebElement getSelectproduct() {
		return Selectproduct;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getGrand() {
		return Grand;
	}

	public WebElement getImage() {
		return Image;
	}

	public WebElement getAddStore() {
		return AddStore;
	}

	public WebElement getZipcode() {
		return Zipcode;
	}

	
    
	
	
	
	
	

}
