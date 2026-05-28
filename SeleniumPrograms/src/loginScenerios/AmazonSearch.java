package loginScenerios;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearch {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		org.openqa.selenium.WebElement w1=driver.findElement(By.id("twotabsearchtextbox"));
		
		
	}

}
