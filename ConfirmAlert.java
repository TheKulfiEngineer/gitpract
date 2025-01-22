package selenium.practice.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//Confirm Alerts can be accepted or dismissed .
public class ConfirmAlert {
	static ChromeDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("menuform:j_idt39")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		posRes();
		negRes();
		driver.close();	
	}
		public static void posRes() throws InterruptedException {
		driver.findElement(By.id("j_idt88:j_idt93")).click();
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println(AlertText);
		alert.accept();
		String PositiveResponse = driver.findElement(By.id("result")).getText();
		System.out.println(PositiveResponse);
		Thread.sleep(3000);
	}
		public static void negRes() {
			driver.findElement(By.id("j_idt88:j_idt93")).click();
			Alert alert = driver.switchTo().alert();
			String AlertText = alert.getText();
			System.out.println(AlertText);
			alert.dismiss();
			String NegativeResponse = driver.findElement(By.id("result")).getText();
			System.out.println(NegativeResponse);
			
		}


}
