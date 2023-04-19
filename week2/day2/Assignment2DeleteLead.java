package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmSFA = driver.findElement(By.linkText("CRM/SFA"));
		crmSFA.click();
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		WebElement findLeads = driver.findElement(By.linkText("Find Leads"));
		findLeads.click();
		WebElement phone= driver.findElement(By.xpath("(//em[@class='x-tab-left'])[2]"));
		phone.click();
		WebElement enterPhone = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		enterPhone.sendKeys("4567");
		WebElement findLeads2 = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		findLeads2.click();
		Thread.sleep(5000);
		String leadID=driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).getText();
		System.out.println(leadID);
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a")).click();
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='ext-gen437']")).getText());
		driver.close();
	
	}

}
