import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ComboDeneme {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/MONSTER/Desktop/Selenium/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	 driver.get("https://loadfocus.com/blog/2016/06/13/how-to-select-a-dropdown-in-selenium-webdriver-using-java/");
	 Select dropdown = new Select(driver.findElement(By.id("mySelect")));
	 dropdown.selectByVisibleText("Italy");
}
}
