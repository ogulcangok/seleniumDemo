
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;




public class Test {
	  public static void main(String[] args) throws InterruptedException {
		  //Setting up the .exe location.
	    	System.setProperty("webdriver.chrome.driver", "C:/Users/MONSTER/Desktop/Selenium/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			
	        String baseUrl = "https://agiris.luca.com.tr/LUCASSO/giris.erp";
	        

	  
	        driver.get(baseUrl);
	     
	       //Entering id .etc
	        WebElement müþteriNo = driver.findElement(By.name("musteriNo"));
	        Thread.sleep(200);
	        müþteriNo.sendKeys("1286842");
	        Thread.sleep(200);
	        WebElement kullanýcýAdý = driver.findElement(By.name("kullaniciAdi"));
	        Thread.sleep(200);
	        kullanýcýAdý.sendKeys("HAMZA11");
	        Thread.sleep(200);
	        WebElement parola = driver.findElement(By.name("parola"));
	        Thread.sleep(200);
	        parola.sendKeys("04320432");
	        Thread.sleep(200);
	        parola.submit();
	        Thread.sleep(200);
	        WebElement test = driver.findElement(By.id("lucaTd"));
	        Thread.sleep(200);
	        test.click();
	        
	        String parentWindowHandler = driver.getWindowHandle();
	        String subWindowHandler = null;
	        
	        Set<String> handles = driver.getWindowHandles(); // get all window handles
	        Iterator<String> iterator = handles.iterator();
	        while (iterator.hasNext()){
	            subWindowHandler = iterator.next();
	        }
	        driver.switchTo().window(subWindowHandler); 
	        System.out.println(driver.getCurrentUrl());// switch to popup window

	        // Now you are in the popup window, perform necessary actions here

	        Thread.sleep(2000);
	        System.out.println(driver.getCurrentUrl());
	   
	     //  Select select = new Select(driver.findElement(By.name("kisayolList")));
	      // select.selectByValue("1463559");
	        WebElement personel = driver.findElement(By.name("hesap"));
	        System.out.println(driver.getCurrentUrl());
	        personel.click();
	      
	  
	       
	        
	        
	       //Select selectBox = new Select(driver.findElement(By.className("form_giris_alan")));
	       
	     //  selectBox.selectByValue("AYDINLAR");
	       

	       
	      
	       
	    }

}