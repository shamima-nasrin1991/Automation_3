package other;
//This test case for getText() 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Text {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p8//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.expedia.com/");
		System.out.println("Website open successfully");
		WebElement element=driver.findElement(By.id("header-history"));
		String text=element.getText();
		System.out.println("The text is:"+text);
		element.click();
		
		
		
		
		// TODO Auto-generated method stub

	}

}
