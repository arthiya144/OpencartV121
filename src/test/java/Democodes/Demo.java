package Democodes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize();
		
		 // entering the value to be searched
		 driver.findElement(By.name("q")).sendKeys("qspiders");
		 Thread.sleep(3000);
		
		 // getting all the suggestions
		 List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(text(),'piders')]"));
		
		 // count of the suggestions
		 System.out.println(suggestions.size());
		
		 //printing all the suggestions
		 for(int i=0; i < suggestions.size();i++) {
			 String sugg = suggestions.get(i).getText();
			 System.out.println(sugg);
		 }
		 //clicking one of the suggestions
		 //suggestions.get(suggestions.size()-2).click();
		 driver.close();
	}
	
}
