package selenium.practice.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//Simple Alerts can only be accepted.
public class SimpleAlert {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("menuform:j_idt39")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		driver.findElement(By.id("j_idt88:j_idt91")).click();
		Alert alert = driver.switchTo().alert();
		String SimpleTextAlert = alert.getText();
		System.out.println(SimpleTextAlert);
		alert.accept();
		
		
		driver.close();
	}

}
