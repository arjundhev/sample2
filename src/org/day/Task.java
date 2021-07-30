package org.day;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Arjunan\\FourthDayTask\\driver\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		//WebElement add = driver.findElement(By.xpath("//p[@style='text-align: left;margin-bottom:0px;'][1]"));
		//String text = add.getText();
		//System.out.println(text);
		
		//Element search = driver.findriver.get("http://www.google.com/");
		//WebdElement(By.name("q"));
	    //  search.sendKeys("https://www.flipkart.com/");
	    //  Thread.sleep(2000);
	   //   WebElement okBtn= driver.findElement(By.xpath("//input[@name='btnK'][1]"));
	   //   okBtn.click();
	   //   WebElement first = driver.findElement(By.xpath("//h3[@class='LC20lb DKV0Md'][1]"));
	   //   first.click();
	   //   WebElement into = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	   //   into.click();
	   //   WebElement sear = driver.findElement(By.className("_3704LK"));
	   //   sear.click();
	   //   WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
	   //   login.click();
	   //   WebElement into1 = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	   //   into1.click();
	   //   Thread.sleep(2000);
	      
		//driver.get("http://www.flipkart.com/");
		//WebElement txtUser = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		//txtUser.sendKeys("Arjunan");
		//String user = txtUser.getText();
		//System.out.println(user);
		//WebElement txtPass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		//txtPass.sendKeys("sathvika");
		//String pass = txtPass.getText();
		//System.out.println(pass);
	
	      driver.get("http://www.amazon.com/");
	     // WebElement ok = driver.findElement(By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']"));
	    //  ok.click();
	      WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone11");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	    
		
	}

}
