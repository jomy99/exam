package Basepkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class wappalyzer {
	WebDriver driver;
	@BeforeTest
	public void ptesting() throws Exception
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver=new ChromeDriver(options);
		driver.get("https://www.wappalyzer.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	@Test
	public void menu()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div/div[2]/div[1]/div[1]/a/div/div/div[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div/div[3]/div/div/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"input-960\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"input-985\"]")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"list-item-982-0\"]")).click();
		
		
	}
}
