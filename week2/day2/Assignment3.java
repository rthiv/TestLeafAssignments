package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kumar.testleaf@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		System.out.println(driver.getTitle());
		WebElement logOut = driver.findElement(By.linkText("Log Out"));
		logOut.click();

	}

}
