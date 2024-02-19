package greenKart;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//h4[contains(text(),'Cucumber')]/parent::div/div[3]/button
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	//	driver.manage().window().maximize();
		Thread.sleep(5000);
		String []name={"Cucumber","Beetroot","Tomato"};
		
		List<WebElement>productslist=driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<productslist.size();i++) {
		
			//Cucumber - 1 Kg
			String[] orgname=productslist.get(i).getText().split("-");
			String formatText=orgname[0].trim();
		List nameList=Arrays.asList(name);
		Thread.sleep(1000);
		//	for(String names:name) {
				if(nameList.contains(formatText)) {
					Thread.sleep(1000);
					driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
					Thread.sleep(5000);
				}
		//}
			}
			
			

}
	

}
