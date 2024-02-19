package SelenimPractise.Practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		String name="Sushil";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		String password=getPassword(driver);
		driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("button.submit")).click();
	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException {
		driver.findElement(By.linkText("Forgot your password?")).click();	
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String orgText=driver.findElement(By.cssSelector("p.infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[]textSplit=orgText.split("'");
		
		String password=(textSplit[1]);
		for(String org:textSplit) {
			System.out.println(org);
		}
		return password;
		
	}


}
