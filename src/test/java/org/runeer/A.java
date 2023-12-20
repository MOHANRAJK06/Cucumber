package org.runeer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import mypac.Baseclass;

public class A extends Baseclass  {
	
	static int a, b;

	public static void main(String[] args) {
		
		firefoxLaunch();
		loadUrl("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
		WebElement r = driver.findElement(By.xpath("//span[contains(text(),'899')]"));
		String q = r.getText();
		int t = Integer.parseInt(q);
		List<WebElement> x = driver.findElements(By.xpath("//span[@class='_2-ut7f _2xc6hH']"));
		for (WebElement y : x) {
			String z = y.getText();
			a = Integer.parseInt(z);
			b = b + a;

		}
		System.out.println(b);
		System.out.println(t);
		if (t == b) {
			System.out.println("verified");
		}
	}
}



