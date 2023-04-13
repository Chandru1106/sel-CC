package com.seleinum.test.seleinum;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc1_1 {
	public static void main(String args[]) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		String name = driver.getTitle();
		System.out.println(name);
		WebElement uname=driver.findElement(By.id("user-name"));
		WebElement pwd=driver.findElement(By.id("password"));
		WebElement submit=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		uname.sendKeys("standard_user");
		pwd.sendKeys("secret_sauce");
		submit.click();
		driver.findElement(By.name("add-to-cart-sauce-labs-fleece-jacket")).click();  
		driver.findElement(By.linkText("1")).click(); 
		driver.findElement(By.name("checkout")).click(); 
		WebElement fname=driver.findElement(By.id("first-name"));
		WebElement lname=driver.findElement(By.id("last-name"));
		WebElement code=driver.findElement(By.id("postal-code"));
		WebElement cont=driver.findElement(By.xpath("//*[@id=\"continue\"]"));
		fname.sendKeys("Chandru");
		lname.sendKeys("R");
		code.sendKeys("638004");
		cont.click();
		String pname=driver.findElement(By.xpath("//*[@id=\"item_5_title_link\"]/div")).getText();
		System.out.println("Product name :" + pname);
		String price=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")).getText();
		System.out.println("Product price :" + price);
		String tprice=driver.findElement(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]")).getText();
		System.out.println("Total price :" + tprice);
		String title="Swag Labs";
		if(name.equals(title)) {
			System.out.println("Validated Page Title");
		}
		String url=driver.getCurrentUrl();
		String url1="https://www.saucedemo.com/checkout-step-two.html";
		if(url1.equals(url)) {
			System.out.println("Validate Page Url");
		}
	}
}
