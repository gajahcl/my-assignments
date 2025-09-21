package Week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class launchBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver= new ChromeDriver();
		
		
		driver.get("https://web.whatsapp.com");
		
		driver.close();
		
		
		
		

	}

}
