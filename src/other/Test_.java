package other;
//The test cases is for verify actual title & target/desire title
 

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_ {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C://Users//Imtiaz//eclipse-workspace//Selenium_home_p8//DRIVER//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.expedia.com/");
		System.out.println("website open successfully");
		String actual_title="Expedia Travel: Search Hotels, Cheap Flights, Car Rentals & Vacations";
		String target_title=driver.getTitle();
		System.out.println(target_title);
		if(target_title.equalsIgnoreCase(actual_title)) {
			System.out.println(" the title is match");
		}
		else {
			System.out.println("the title is not match");
		}
	String url=driver.getCurrentUrl();
	System.out.println(url);
	/*String page=driver.getPageSource();
	System.out.println(page);*/
	

	}



		// TODO Auto-generated method stub

	}


