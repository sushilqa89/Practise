package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		for(int i=1;i<5;i++) {
		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(1000);
		}
		driver.findElement(By.id("btnclosepaxoption")).click();

	}

}
