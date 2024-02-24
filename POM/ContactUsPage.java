import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	public class ContactUsPage extends BasePage {
		
		
		
		 public static WebElement element = null;

		    // Locators of the Elements present in this page
		    private static String name = "name";
		    private static String email = "email";
		    private static String subject = "subject";
		    private static String message = "message";
		    private static String SUBMIT_BUTTON = "//button[@class='btn btn regular-main-button submit submit btn-warning']";
		    private static String successMessage = "/html/body/div[1]/div[1]/div/div[1]/div/div";
		    
		    
		    
		    

		    // Web elements from the locators
		    public static WebElement name(WebDriver driver) {
		        element = driver.findElement(By.id(name));
		        return element;
		    }
		    
		    
		    public static WebElement email(WebDriver driver) {
		        element = driver.findElement(By.id(email));
		        return element;
		    }
		    
		    public static WebElement subject(WebDriver driver) {
		        element = driver.findElement(By.id(subject));
		        return element;
		    }
		    
		    
		    public static WebElement message(WebDriver driver) {
		        element = driver.findElement(By.id(message));
		        return element;
		    }
		    
		    
		    
		    
		 public static WebElement SUBMIT_BUTTON(WebDriver driver) {
		        element = driver.findElement(By.xpath(SUBMIT_BUTTON));
		        return element;
		    }
		    
		 
		 public static WebElement successMessage(WebDriver driver) {
		        element = driver.findElement(By.xpath(successMessage));
		        return element;
		    }
		    
		 
		 
		 
		  // Methods to perform actions on the elements in this page
		    public static void entername(WebDriver driver, String name) {
		        element = name(driver);
		        element.sendKeys(name);
		        System.out.println("nk");
		    }
		    
		    
		    public static void enteremail(WebDriver driver, String email) {
		        element = email(driver);
		        element.sendKeys(email);
		        System.out.println("n2@gmail.com");
		    }
		    
		    public static void entersubject(WebDriver driver, String subject) {
		        element = subject(driver);
		        element.sendKeys(subject);
		        System.out.println("selenium");
		    }
		    
		    
		    public static void entermessage(WebDriver driver, String message) {
		        element = message(driver);
		        element.sendKeys(message);
		        System.out.println("Automation");
		    }
		    
		    
		    
		    public static void SubmitButton(WebDriver driver) {
		        element = SUBMIT_BUTTON(driver);
		        element.click();
		        System.out.println("Clicked on the Submit button");
		    }
		        
		    
		    
		    public static boolean SuccessMessage(WebDriver driver) {
		    	element = successMessage(driver);
		       element.isDisplayed();
		       // element.sendKeys(successMessage);
				return true;
		        
		    	
		    
	}
	}
		
		    
		    
		    
		    


