package BasePck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	WebDriver driver;
   public BasePage(WebDriver driver) {
	   this.driver=driver;
   }
   
   public void addUser(String FName,String LName,String UName,String Password,String email) {
	   driver.findElement(By.xpath("//*[text()=' Add User']")).click();
	   driver.findElement(By.cssSelector("input[name='FirstName']")).sendKeys(FName);
	   driver.findElement(By.name("LastName")).sendKeys(LName);
	   driver.findElement(By.xpath("//input[@name='UserName']")).sendKeys(UName);
	   driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(Password);
	   driver.findElement(By.xpath("//label[normalize-space()='Company AAA']")).click();
	   WebElement webEl= driver.findElement(By.xpath("//select[@name='RoleId']"));
	   //Selecting Role from drop down
	   selectRole("Admin",webEl);
	   driver.findElement(By.xpath("//input[@name='Email']")).sendKeys(email);
	   driver.findElement(By.xpath("//input[@name='Mobilephone']")).sendKeys("9858640000");
	   driver.findElement(By.xpath("//button[text()='Save']")).click();
   }
   public boolean isUserExist(String userName) {
	   try {
	   driver.findElement(By.xpath("//td[text()='" +userName+ "']"));
       return true;
	   }catch (Exception e) {
		   return false;
	   }
   }
   
   public static void selectRole(String Role,WebElement webEl) {
	   Select sl= new Select(webEl);
	   sl.selectByVisibleText(Role);
   }
   public void deleteUser(String UName) {
	   driver.findElement(By.xpath("//td[text()='" + UName + "']/following-sibling::td/button[@ng-click='delUser()']")).click();
	   driver.findElement(By.xpath("//button[text()='OK']")).click();
   }
}
