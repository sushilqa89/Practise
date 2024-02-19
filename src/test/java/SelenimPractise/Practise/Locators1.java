package SelenimPractise.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String name="rahul";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.submit")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.cssSelector("div[class*=login] p")).getText());
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class*=login] p")).getText(), "You are successfully logged in.");
		driver.findElement(By.xpath("//div[contains(@class,'login')]/h2")).getText();
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'login')]/h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		driver.close();

	}

}
