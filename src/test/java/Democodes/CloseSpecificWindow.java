package Democodes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CloseSpecificWindow
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@name=\"q\"]")).sendKeys("Selenium");
		Actions action=new Actions(driver);
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
				
				
		WebElement seleniumlink=driver.findElement(By.xpath("//a[@href='https://www.selenium.dev/']/h3[text()='Selenium']"));
		
		//Actions action=new Actions(driver);
		
		action.keyDown(Keys.CONTROL).click(seleniumlink).keyUp(Keys.CONTROL).perform();
		
		WebElement GreeksLink=driver.findElement(By.xpath("//a[@class='zReHs']/h3[contains(text(),'Limitations')]"));
		action.keyDown(Keys.CONTROL).click(GreeksLink).keyUp(Keys.CONTROL).perform();
		driver.close();
		
	}
	//driver.close
}
