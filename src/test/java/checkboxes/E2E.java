package checkboxes;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='AIP'])[2]")).click();
		driver .findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		for(int i=1;i<5;i++) {
			driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
	}

}
