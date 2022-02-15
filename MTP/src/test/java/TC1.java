import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 {
  @Test
  public void TestCaseOne() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ProgrammingProject\\Java\\SelP\\chromedriver.exe");
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.google.com/");
      try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
  }
  @Test
  public void testCase2() {
	  System.setProperty("webdriver.chrome.driver", "D:\\ProgrammingProject\\Java\\SelP\\chromedriver.exe");
      WebDriver driver =new ChromeDriver();
      driver.get("https://www.Yahoo.com/");
	  
  }
}
