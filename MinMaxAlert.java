package selenium.practice.alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MinMaxAlert {
	static ChromeDriver driver = new ChromeDriver();
	public static void main(String[] args) throws InterruptedException {
		driver.manage().window().maximize();
		driver.navigate().to("https://www.leafground.com/dashboard.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.id("menuform:j_idt39")).click();
		driver.findElement(By.id("menuform:m_overlay")).click();
		minimize();
		maximize();
		closeButton();
		driver.close();
	}
		public static void  minimize() throws InterruptedException {
			driver.findElement(By.id("j_idt88:j_idt111")).click();
			String text = driver.findElement(By.xpath("//p[contains(text (), 'minimized')]")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-minus']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-plus']")).click();
			Thread.sleep(3000);
}
		public static void  maximize() throws InterruptedException {
			driver.findElement(By.id("j_idt88:j_idt111")).click();
			String text = driver.findElement(By.xpath("//p[contains(text (), 'minimized')]")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-extlink']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-newwin']")).click();
			Thread.sleep(3000);
		}
		public static void  closeButton() throws InterruptedException {
			driver.findElement(By.id("j_idt88:j_idt111")).click();
			String text = driver.findElement(By.xpath("//p[contains(text (), 'minimized')]")).getText();
			System.out.println(text);
			driver.findElement(By.xpath("(//span[@class = 'ui-icon ui-icon-closethick'])[3]")).click();
			Thread.sleep(3000);
		
		}
		}
