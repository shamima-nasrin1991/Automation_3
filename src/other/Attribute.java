package other;
//This test cases for get attribute

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Attribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p8//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.expedia.com/");
		System.out.println("Website open successfully");
		WebElement element=driver.findElement(By.id("primary-header-package"));
		String target_value=element.getAttribute("target");
		System.out.println("value of target attribut:"+target_value);
		element.click();
		// TODO Auto-generated method stub

	}

}
