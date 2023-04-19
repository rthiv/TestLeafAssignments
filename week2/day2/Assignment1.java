package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement createAccount = driver.findElement(By.linkText("Create new account"));
		createAccount.click();
		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Emma");
		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("Watson");
		WebElement mobileNum = driver.findElement(By.name("reg_email__"));
		mobileNum.sendKeys("12345");
		WebElement passWord = driver.findElement(By.id("password_step_input"));
		passWord.sendKeys("6789");
		WebElement bday = driver.findElement(By.id("day"));
		bday.sendKeys("14");
		WebElement month = driver.findElement(By.id("month"));
		Select monthDD = new Select(month);
		monthDD.selectByVisibleText("Jul");
		WebElement year = driver.findElement(By.id("year"));
		Select yearDD = new Select(year);
		yearDD.selectByVisibleText("1992");
		WebElement gender = driver.findElement(By.xpath("//input[@value='1']"));
		gender.click();
		
	}

}
