package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment4Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@placeholder='Babu Manickam']")).sendKeys("Babu Manickam");
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys(",India");
		System.out.println(driver.findElement(By.xpath("//input[@placeholder='Disabled']")).isEnabled());
		driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
		System.out.println(driver.findElement(By.xpath("//input[@value='My learning is superb so far.']")).getAttribute("value"));
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("aarthi.v@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Hello, ...");
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[1]")).sendKeys("Hey");
		driver.findElement(By.id("j_idt106:thisform:age")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("j_idt106:float-input")).click();
		driver.findElement(By.id("j_idt106:auto-complete_input")).sendKeys("Aarthi");
		driver.findElement(By.xpath("(//span[@id='j_idt106:auto-complete_panel']/ul/li)[3]")).click();
		driver.findElement(By.id("j_idt106:j_idt116_input")).click();
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[5]")).click();
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("1");
		driver.findElement(By.xpath("//span[@id='j_idt106:j_idt118']/a")).click();
		driver.findElement(By.id("j_idt106:slider")).sendKeys("3");
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		driver.findElement(By.xpath("(//div[@class='ql-editor ql-blank'])[2]")).sendKeys("Hello Everyone");

	
		

	}

}
