import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning {

	public static void main(String[] args) {
		System.out.println("checking");
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe" );
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
