package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
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
		WebElement createLead = driver.findElement(By.linkText("Create Lead"));
		createLead.click();
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Google");
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Aarthi");
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("V");
		WebElement firstNamelocal= driver.findElement(By.id("createLeadForm_firstNameLocal"));
		firstNamelocal.sendKeys("rt");
		WebElement dept=driver.findElement(By.id("createLeadForm_departmentName"));
		dept.sendKeys("Testing");
		WebElement description=driver.findElement(By.id("createLeadForm_description"));
		description.sendKeys("Need a list of Testing courses offered");
		WebElement emailId=driver.findElement(By.id("createLeadForm_primaryEmail"));
		emailId.sendKeys("aarthi.v@gmail.com");
		WebElement State=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDD= new Select(State);
		stateDD.selectByVisibleText("New York");
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
		System.out.println(driver.getTitle());
		
		

				

	}

}
