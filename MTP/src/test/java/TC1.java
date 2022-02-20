import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC1 {
	public WebDriver driver;
	
	public TC1() {
	System.setProperty("webdriver.chrome.driver", "D:\\ProgrammingProject\\Java\\SelP\\chromedriver.exe");
     driver =new ChromeDriver();
	}
  @Test
  public void TestCaseOne() {
	  
      driver.get("https://www.google.com/");
      System.out.println();
      try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     
  }
  @Test
  public void testCase2() {
	 // System.setProperty("webdriver.chrome.driver", "D:\\ProgrammingProject\\Java\\SelP\\chromedriver.exe");
     // WebDriver driver =new ChromeDriver();
      driver.get("https://www.Yahoo.com/");
      System.out.println("opening yahoo");
	  
  }
  public void Testcse3() {
	  
	  
  }
}
