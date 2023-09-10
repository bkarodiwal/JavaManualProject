package test.com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\BHUSHAN\\eclipse-workspace\\SeleniumManualLibraries\\browserDriver\\chromedriver.exe");
		System.out.println(System.getProperty("webdriver.chrome.driver"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		Thread.sleep(3000);
		System.out.println("Done");
		driver.quit();

	}
}
