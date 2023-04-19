package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		Select se1 = new Select(tool);
		se1.selectByVisibleText("Selenium");
		
		driver.findElement(By.xpath("//div[@id='j_idt87:country']/div/span")).click();
		driver.findElement(By.xpath("//li[@data-label='India']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='j_idt87:city']/div/span")).click();
		driver.findElement(By.xpath("//li[@data-label='Chennai']")).click();
		
		driver.findElement(By.xpath("//div[@id='j_idt87:auto-complete']/button")).click();
		driver.findElement(By.xpath("//li[@data-item-label='Selenium WebDriver']")).click();
		
		driver.findElement(By.id("j_idt87:lang_label")).click();
		driver.findElement(By.xpath("//li[@data-label='English']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id='j_idt87:value']/div/span")).click();
		driver.findElement(By.xpath("//li[@id='j_idt87:value_2']")).click();
		

	}

}
