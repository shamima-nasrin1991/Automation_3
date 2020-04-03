package other;
//using linkText locator
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p8//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.expedia.com/");
		System.out.println("Webpage open");
		driver.findElement(By.linkText("Flights")).click();
		//driver.findElement(By.linkText("Hotels")).click();
		// TODO Auto-generated method stub

	}

}
