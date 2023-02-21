package webdriverCommands;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommand2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.get("https://www.greatandhra.com");
		/*
		 * 
		 * difference between navigate and get to method belongs to navigation Interface
		 * and get belongs to WebDriver IInterface
		 */
		driver.manage().window().maximize();//without using a variable;
		driver.get("https://www.greatandhra.com");
		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.manage().window().setSize(new Dimension(0,0));
		/*Options opt = driver.manage();
		Window win = opt.window();
		//win.maximize();
		driver.get("https://www.greatandhra.com");
		//win.minimize();
		//win.maximize();
         win.fullscreen();*/
	}

}
