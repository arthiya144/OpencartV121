package Democodes;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class FileUploadFeature
{
	@Test
	public void testfileupload()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
	//WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://the-internet.herokuapp.com");
	WebElement fileupload=driver.findElement(By.xpath("//a[contains(text(),'File Upload')]"));
	fileupload.click();
	System.out.println("Clicked on fileuploadlink successfully");
	WebElement choosefile=driver.findElement(By.id("file-upload"));
	String filepath="C:\\Users\\activ\\OneDrive\\Documenten\\Resume";
	choosefile.sendKeys(filepath);
	WebElement UploadBtn=driver.findElement(By.xpath("//input[@value='Upload']"));
	UploadBtn.click();
	
	
	
	}

}
