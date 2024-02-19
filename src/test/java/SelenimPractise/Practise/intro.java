package SelenimPractise.Practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
	//	ChromeDriver driver1 = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
