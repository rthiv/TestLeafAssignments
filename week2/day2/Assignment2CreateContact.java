package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CreateContact {

	public static void main(String[] args) {
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
		WebElement leads = driver.findElement(By.linkText("Contacts"));
		leads.click();
		WebElement createLead = driver.findElement(By.linkText("Create Contact"));
		createLead.click();
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Aarthi");
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("V");
		WebElement firstNamelocal= driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNamelocal.sendKeys("rt");
		WebElement lastNamelocal= driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNamelocal.sendKeys("v");
		WebElement dept=driver.findElement(By.id("createContactForm_departmentName"));
		dept.sendKeys("Testing");
		WebElement description=driver.findElement(By.id("createContactForm_description"));
		description.sendKeys("Contact description");
		WebElement emailId=driver.findElement(By.id("createContactForm_primaryEmail"));
		emailId.sendKeys("aarthi.v@gmail.com");
		WebElement State=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stateDD= new Select(State);
		stateDD.selectByVisibleText("New York");
		WebElement createContactButton = driver.findElement(By.className("smallSubmit"));
		createContactButton.click();
		WebElement editButton= driver.findElement(By.linkText("Edit"));
		editButton.click();
		WebElement updateDescription=driver.findElement(By.id("updateContactForm_description"));
		updateDescription.clear();
		WebElement impNote=driver.findElement(By.id("updateContactForm_importantNote"));
		impNote.sendKeys("High revenue generator");
		WebElement updateButton = driver.findElement(By.xpath("//input[@value='Update']"));
		updateButton.click();
		System.out.println(driver.getTitle());
	}

}
