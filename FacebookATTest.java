import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookATTest {
	
	public static void main(String[] args) {
		
		// CCS Component Verification
		System.setProperty("webdriver.chrome.driver", "C:\\LSA\\Tools\\Selenium\\Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.cssSelector("input#email")).sendKeys("aumesh@gmail.com");
		//driver.findElement(By.cssSelector("input#u_0_a")).click();
		//Boolean bb = driver.findElement(By.cssSelector("input.inputtext")).isDisplayed();
		//System.out.println(bb);
		
		
		
		

	}

}
