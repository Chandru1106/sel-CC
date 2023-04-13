package com.seleinum.test.seleinum;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cc1_2 {
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
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).click();
		String pname=driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).getText();
		System.out.println("Product name,While in A-Z :" + pname);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]")).click();
		String pname1=driver.findElement(By.xpath("//*[@id=\"item_3_title_link\"]/div")).getText();
		System.out.println("Product name,While in Z-A :" + pname1);
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[4]")).click();
		String pname2=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println("Product price,While in high to low :" + pname2);
		System.out.println("Hence high to low price is verify");
		driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
		String pname3=driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]/div[2]/div[2]/div")).getText();
		System.out.println("Product price,While in low to high :" + pname3);
		System.out.println("Hence low to high price is verify");
	}
}
