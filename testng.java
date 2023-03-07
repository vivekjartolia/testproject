package assignment_sportstak;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class testng {
@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://thesportstak.com");
	    
	    //hindi language
	     driver.findElement(By.xpath("//span[text()='Hindi']")).click();
	  
	    //Home
	    driver.findElement(By.xpath("//span[text()='Home']")).click();
	   
	    //all
	    driver.findElement(By.xpath("//span[text()='All']")).click();
	    //on each thumbnail
	   
	   driver.findElement(By.xpath("//h2[text()='INSIDE TRAINING | A 360 tour of training from Reiss Nelson in Dubai']")).click();
	   //Cricket
	   driver.findElement(By.xpath("//span[text()='Cricket']")).click();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,1000)");
	   driver.findElement(By.xpath("//h2[text()='KL Rahul promises AGGRESSIVE CRICKET from India in Bangladesh Test series | Sports Today']")).click();
	  
	   //darkmode
	   driver.findElement(By.xpath("//span[text() ='Light']")).click();
	   //webstory
	   driver.findElement(By.xpath("//a[text()='Web Story']")).click();
	   driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div/div[2]/div/div/a[1]/section/div/div")).click();
	   System.out.println("Ben Stokes equals Ricky Ponting-Waqar Younis sensational Test record");
	   //next
	   driver.findElement(By.xpath("/html/body/amp-story/div[2]")).click();
	   driver.navigate().back();
	   Thread.sleep(1000);
	   
	   
	}

}
