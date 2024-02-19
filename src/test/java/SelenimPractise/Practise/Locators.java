package SelenimPractise.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("shetty");
		driver.findElement(By.cssSelector("button.submit")).click();
		System.out.println(driver.findElement(By.className("error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();	
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("robot");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("patilsushil89@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9920795130");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		//Thread.sleep(1000);
		
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		
		
	}

}
