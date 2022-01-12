import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testing {
	
	 @Test
	  public void testCase3() {
		  System.setProperty("webdriver.chrome.driver", "D:\\ProgrammingProject\\Java\\SelP\\chromedriver.exe");
	      WebDriver driver =new ChromeDriver();
	      driver.get("https://www.Yahoo.com/");
		  
	  }

}
