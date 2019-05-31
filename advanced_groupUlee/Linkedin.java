package test.java.advanced_group;


import java.util.List;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Linkedin {
	
static WebDriver driver;
	
	@Before
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	@Test
	public void testMyPage() throws InterruptedException {
		
		driver.navigate().to("https://www.linkedin.com/");
		Thread.sleep(2000);
		WebElement signIn = driver.findElement(By.xpath("//a[@class='nav__button-secondary']"));
		signIn.click();
		Thread.sleep(2000);
		WebElement username =driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("leetech504@gmail.com");
		Thread.sleep(2000);
		WebElement passwd =driver.findElement(By.xpath("//input[@id='password']"));
		passwd.sendKeys("Dushman858575$@");
		Thread.sleep(2000);
		WebElement signin =driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']"));
		signin.click();
		Thread.sleep(2000);
		WebElement me =driver.findElement(By.xpath("//button[@id='nav-settings__dropdown-trigger']//img[@alt='Palancha Tukunchoev']"));
		me.getText();
		
		System.out.println(me);
		System.out.println("signedIn");
		Thread.sleep(2000);
		WebElement icon =driver.findElement(By.xpath("//button[@id='nav-settings__dropdown-trigger']"));
		icon.click();
		Thread.sleep(2000);
		WebElement signOut =driver.findElement(By.xpath("//a[@data-control-name='nav.settings_signout']"));
		signOut.click();
		Thread.sleep(2000);
		System.out.println("SignedOut");
		
		
       
		
		
	}
	@After
	public void tearDown() {
		driver.quit();
	}
}