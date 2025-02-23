package with_Password;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

public class Login_with_pass {

	private static final String[] O = null;

	//public Login_with_pass() {
	public static void main(String[] args) throws InterruptedException {
		
	System.out.println("hi");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://app.treflo.com/get-started/signin");
		driver.manage().window().maximize();
		//Clicking login with password box
		
		WebElement pass=driver.findElement(By.xpath("//button[@type='button']"));
		pass.click();
		
		// Entering Phone number in the text box
		 WebElement email=driver.findElement(By.xpath("//input[@placeholder='Enter here']"));
		email.sendKeys("9944043453");
		
         //Entering Password in the text box
	
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Enter password']"));
		password.sendKeys("anithask");
		//Clicking the login button
		WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	
	Actions acc = new Actions(driver);
	Thread.sleep(3000);
	//Clicking the invoice tab
	WebElement createinvoice = driver.findElement(By.xpath("//span[text()='Create Invoice']"));
	acc.moveToElement(createinvoice).click().perform();
	
	Thread.sleep(4000);
	//Clicking the invoice box 
	WebElement INV = driver.findElement(By.xpath("//input[@value='INV']"));
	
	//INV.equals(true);
	String a="INV";
	int b=1;
	if (b==1) {
		System.out.println("Invoice is priniting");
		System.out.println("INV");
		
	} else {
		System.out.println("Not an  Invoice");
	}
	
//		
	Thread.sleep(3000);
		WebElement INC = driver.findElement(By.xpath("//div[@style='display: flex;']//child::div[@style='position: relative;']//child::input"));
    INC.click(); 
    int c=1;
    if(c==1) { System.out.println("It is incrementing");
   
    }
    else {
		System.out.println("it is decrementing");
	}
    
//    Thread.sleep(3000);
//    // Company Address
//    //Using text
//    WebElement company=driver.findElement(By.xpath("//span[text()='Company Address ']"));
//   	company.click();
//   	company.getText();
//    WebElement GST = driver.findElement(By.xpath("//span[text()='GST: ']"));
//   GST.getText(); 
//  //To add address
//   Thread.sleep(3000);
   //WebElement add_addr = driver.findElement(By.xpath("//div[@class='p-1']//ancestor::div[@role='dialog']"));
   //add_addr.click();
   driver.findElement(By.xpath("//*[@id='__next']/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[4]/div[2]/div/input")).clear();
   driver.findElement(By.xpath("//*[@id='__next']/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[4]/div[2]/div/input")).sendKeys("9944043453"); 
   
 
driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[5]/div[2]/div/input")).clear();
driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div[3]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div[5]/div[2]/div/input")).sendKeys("anitha@test.com");
;


		
	
	}

}
