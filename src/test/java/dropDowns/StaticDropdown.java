package dropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement drop = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropDown = new Select(drop);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByIndex(2);
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByVisibleText("USD");
		System.out.println(dropDown.getFirstSelectedOption().getText());
		dropDown.selectByValue("INR");
	}

}
