package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt89']/div)[2]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt91']/div)[2]")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@id='j_idt87:basic']/tbody/tr/td[1]/div")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:ajaxTriState']/div)[2]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:j_idt100']/div)[2]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='j_idt87:j_idt102']/div/input")).isEnabled());
		
		driver.findElement(By.xpath("//div[@Id='j_idt87:multiple']/div/span")).click();
		driver.findElement(By.xpath("(//li[@data-item-value='London']/div/div)[2]")).click();
		driver.findElement(By.xpath("(//li[@data-item-value='Miami']/div/div)[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div/a")).click();
	}

}
