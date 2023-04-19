package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Assignment4Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println("Is Enabled: " +driver.findElement(By.xpath("//button[@id='j_idt88:j_idt92']")).isEnabled());
		System.out.println("Location: " +driver.findElement(By.xpath("//button[@id='j_idt88:j_idt94']")).getLocation());
		String cssValue = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt96']")).getCssValue("background-color");
		System.out.println("Color: " + Color.fromString(cssValue).asHex());
		System.out.println("Size: " + driver.findElement(By.xpath("//button[@id='j_idt88:j_idt98']")).getSize());
		WebElement mouseOver= driver.findElement(By.xpath("//button[@id='j_idt88:j_idt100']"));
		System.out.println("Before scroll: " + Color.fromString(mouseOver.getCssValue("background-color")).asHex());
		Actions mouse = new Actions(driver);
		mouse.moveToElement(mouseOver);
		mouse.clickAndHold(mouseOver).build().perform();
		String cssValue2 = mouseOver.getCssValue("background-color");
		System.out.println("After scroll: " + Color.fromString(cssValue2).asHex());
		mouse.release(mouseOver).perform();
		
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt102:imageBtn']")).click();
		List<WebElement> roundedButtons =driver.findElements(By.cssSelector("body .ui-button.rounded-button"));
		System.out.println("No. of rounded buttons: " +roundedButtons.size());

	}

}
