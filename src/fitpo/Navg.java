package fitpo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import utility.mk;

public class Navg implements mk {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();//Web browser is open
		driver.navigate().to(fitpo);//fitpo home page is open
		driver.manage().window().maximize();// Maximize the webs browser
		Thread.sleep(2000);// Use to hold the while a time
		
		driver.navigate().to(rvn_cal);//Navigate to Revenue Calculator
		Thread.sleep(2000);
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0, 270)");
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.xpath("//input[@type='range']"));
		
	   for (int i =1; i <= 620 ; i++)
	   { 			
	            e.sendKeys(Keys.ARROW_RIGHT);
	       }

	  Thread.sleep(3000);
	    
	 
	   driver.findElement(By.xpath("//input[@type= 'number']")).sendKeys("560");
	   
	   JavascriptExecutor scroll1 = (JavascriptExecutor)driver;
		scroll1.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[1]/label/span[1]/input")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/label/span[1]/input")).click();
	    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[3]/label/span[1]/input")).click();
	    Thread.sleep(2000);
	    
	    JavascriptExecutor scroll2 = (JavascriptExecutor)driver;
		scroll2.executeScript("window.scrollBy(0, 730)");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[8]/label/span[1]/input")).click();
	    
	}

	
		
}
	

