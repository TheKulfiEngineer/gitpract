package selenium.practice.alerts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

// A Text can be given as input and accepted or cancelled
public class PromptAlert {
	static ChromeDriver driver = new ChromeDriver();

	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("menuform:j_idt39")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		posInput();
		negInput();
		driver.close();
	}

	public static void posInput() throws InterruptedException {
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println(AlertText);
		alert.sendKeys("God is good");
		alert.accept();
		String PositiveResponse = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(PositiveResponse);
		Thread.sleep(3000);
	}

	public static void negInput() {
		driver.findElement(By.id("j_idt88:j_idt104")).click();
		Alert alert = driver.switchTo().alert();
		String AlertText = alert.getText();
		System.out.println(AlertText);
		alert.dismiss();
		String NegativeResponse = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(NegativeResponse);

	}
}
