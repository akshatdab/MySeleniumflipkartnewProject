package javaprojectpackage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javaclasses {
	
	public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver = new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();


try {
	WebElement closebutton= driver.findElement(By.xpath("//span[@class='_30XB9F']"));
if(closebutton.isDisplayed()) {
	closebutton.click();
    System.out.println("Login popup closed.");}
}
catch(Exception e) {
	System.out.println("Login popup not displayed");
}

WebElement search= driver.findElement(By.xpath("//input[@class='Pke_EE']"));
search.sendKeys("iphone 14");
search.sendKeys(Keys.ENTER);

WebElement iphone14= driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[11]"));

Actions action = new Actions(driver);
action.moveToElement(iphone14);
iphone14.click();

Set<String> abc = driver.getWindowHandles();
Iterator<String> main = abc.iterator();
String parentwindow = main.next();
String childwindow = main.next();
       
driver.switchTo().window(childwindow);

    Thread.sleep(3000);
        WebElement notify= driver.findElement(By.xpath("//div[@class='_3GOL67 gTLS5r']//child::button"));
        notify.click();

}

	}

