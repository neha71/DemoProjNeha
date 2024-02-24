
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

	public class PageDemoTest
	{


		  public static void main(String[] args) throws InterruptedException
			{
			
	         
	            ChromeDriver driver = new ChromeDriver();
	            driver.manage().window().maximize();
	            driver.get("https://demostore.x-cart.com/");
	            
	        
	             // Actions taken on the Home Page
	            
	            HomePage.navigateToContactUs(driver);
	             
	           
	            // Action taken on the ContactUs Page  
	            
	            
	            

	            // Actions taken on the Flight Page
	            ContactUsPage.entername (driver, "nk");
	            Thread.sleep(2000);
	            ContactUsPage.enteremail(driver, "n2@gmail.com");
	            Thread.sleep(2000);
	            ContactUsPage.entersubject(driver, "selenium");
	            ContactUsPage.entermessage(driver, "Automation");
	            Thread.sleep(2000);
	            ContactUsPage.SUBMIT_BUTTON(driver).click();
	            ContactUsPage.SuccessMessage(driver);

	            
	           // ContactUsPage.enterDetailsAndSubmit(driver, "nk", "n@gmail.com", "QA", "selenium");
	      
	            
	            
	            if (ContactUsPage.SuccessMessage(driver ) )
	            		{
	                // Success message is displayed
	                System.out.println("Success message is displayed.");
	            } 
	            else 
	            {
	                // Success message is not displayed
	                System.out.println("Success message is not displayed.");
	            }
	     
	           // driver.quit();
	        }
		
	}
		
	
	    

