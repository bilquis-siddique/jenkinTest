package testDynamicElement.testDynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

/*
 *Author is Bilquis Haq. 
 * Made changes for Github branch
 */
public class dynamicElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement linkLogin = driver.findElement(By.xpath("//a[@href='https://ui.freecrm.com']"));
		linkLogin.click();
		System.out.println("Login link is clicked");
		Thread.sleep(2000);

		WebElement txtUsername = driver.findElement(By.xpath("//input[@name='email']"));
		txtUsername.sendKeys("bilquis.siddique@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@name='password']"));
		txtPassword.sendKeys("test@Sel1234");
		WebElement submitBtn = driver.findElement(By.xpath("//*[@class='ui fluid large blue submit button']"));
		submitBtn.click();
		Thread.sleep(2000);		
		
		WebElement contactLink = driver.findElement(By.xpath("//span[@class='item-text'][contains(text(), 'Contacts')]"));
		contactLink.click();
		Thread.sleep(3000);
		
		WebElement chkBox = driver.findElement(By.xpath("//td[contains(text(), 'Farah Siddique')]//preceding-sibling::td//input[@name='id']"));
		
		Actions act= new Actions(driver);
		act.moveToElement(chkBox).click().build().perform();
		System.out.println("Checkbox is clicked");
		
		Thread.sleep(2000);
		driver.quit();
	}
}
