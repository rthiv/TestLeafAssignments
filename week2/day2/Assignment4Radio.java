package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//table[@id='j_idt87:console1']/tbody/tr/td[2]/div/div)[2]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:city2']/div/div/div/div)[2]")).click();
		driver.findElement(By.xpath("(//table[@id='j_idt87:console2']/tbody/tr/td/div)[1]")).click();
		driver.findElement(By.xpath("(//div[@id='j_idt87:age']/div/div/div)[1]")).click();
	}

}
